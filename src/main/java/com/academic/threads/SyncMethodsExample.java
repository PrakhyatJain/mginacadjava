/**
 * 
 */
package main.java.com.academic.threads;

/**
 * @author MEGAINFO
 * 
 */
public class SyncMethodsExample extends Thread {

	static String[] msg = { "Beginner", "java", "tutorial,", ".,", "com", "is",
			"the", "best" };

	public SyncMethodsExample(String id) {
		super(id);
	}

	public static void main(String[] args) {
		SyncMethodsExample thread1 = new SyncMethodsExample("thread1: ");
		SyncMethodsExample thread2 = new SyncMethodsExample("thread2: ");
		thread1.start();
		thread2.start();
		boolean t1IsAlive = true;
		boolean t2IsAlive = true;
		do {
			if (t1IsAlive && !thread1.isAlive()) {
				t1IsAlive = false;
				System.out.println("t1 is dead.");
			}
			if (t2IsAlive && !thread2.isAlive()) {
				t2IsAlive = false;
				System.out.println("t2 is dead.");
			}
		} while (t1IsAlive || t2IsAlive);
	}

	void randomWait() {
		try {
			Thread.currentThread().sleep((long) (3000 * Math.random()));
		} catch (InterruptedException e) {
			System.out.println("Interrupted!");
		}
	}

	public synchronized void run() {
		SynchronizedOutput.displayList(getName(), msg);
	}
}

class SynchronizedOutput {

	// if the 'synchronized' keyword is removed, the message
	// is displayed in random fashion
	public static synchronized void displayList(String name, String list[]) {
		for (int i = 0; i < list.length; i++) {
			SyncMethodsExample t = (SyncMethodsExample) Thread.currentThread();
			t.randomWait();
			System.out.println(name + list[i]);
		}
	}
}