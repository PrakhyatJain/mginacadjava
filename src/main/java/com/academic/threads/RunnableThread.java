package main.java.com.academic.threads;

/**
 * @author Ramesh Karuti
 *
 */

class RunnableDemo implements Runnable {
	Thread t;

	RunnableDemo() {
		// Creating a new second thread
		t = new Thread(this, "Clild thread");
		System.out.println("Child thread " + t);
		t.start();
	}

	// This is the entry point for the second thread
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child thread" + i);
				Thread.sleep(900);
			}
		} catch (InterruptedException e) {
			System.out.println(" Child interrupted");
		}
		System.out.println("Exiting child thread !");
	}
}
public class RunnableThread {
	public static void main(String args[]) {
		new RunnableDemo();
		// Created a new thread
		try {
			for (int i = 5; i > 0; --i) {
				System.out.println("main " + i);
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main interrupted");
		}
		System.out.println("Main exiting !");
	}
}
