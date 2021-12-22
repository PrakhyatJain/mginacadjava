/**
 * 
 */
package main.java.com.academic.threads;

/**
 * @author Ramesh Karuti
 * 
 */
class Even implements Runnable {
	Thread t;

	public Even() {
		t = new Thread();
	}

	public void run() {

		// Non synchronized block...
		synchronized (this) {
			for (int i = 0; i <= 5; i++) {
				Thread.currentThread();
				System.out.println("Non-Synchronized Block");
				System.out.println("Current Thread1 " + Thread.currentThread());
//				try {
//					t.sleep(1500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				// System.out.println(i);
			}
		}

		// Synchronized block...
		synchronized (this) {
			System.out.println("Synchronized Block");
			for (int i = 0; i <= 5; i++) {
				Thread.currentThread();
				System.out.println("Current Thread2 " + Thread.currentThread());
				// System.out.println(i);
			}
		}

	}
}

public class SynchronizationThread {
	public static void main(String arg[]) {
		Even e = new Even();
		Thread t = new Thread(e);
		t.setName("Thread One");
		//Thread t1 = new Thread(e);
		//t1.setName("Thread Two");
		t.start();
		//t1.start();
	}
}
