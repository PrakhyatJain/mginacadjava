/**
 * 
 */
package main.java.com.academic.threads;

/**
 * @author Ramesh Karuti
 * 
 */
class ThreadExe extends Thread {
	ThreadExe() {
		System.out.println("Child Thread:" + this);
		start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Child Thread:" + i);
				Thread.sleep(1500);
				
			} catch (NullPointerException e) {
				System.out.println("Null pointerException");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Existing Child Thread.");
	}
}

public class ExtendsThread {
	public static void main(String arg[]) {
		// Thread t = new Thread();
		new ThreadExe();
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Main thread:" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} catch (NullPointerException e) {
				System.out.println("Null PointerException");
			}
		}
		System.out.println("Main thread exiting.");
	}
}
