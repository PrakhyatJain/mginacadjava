/**
 * 
 */
package main.java.com.academic.threads;

/**
 * @author MEGAINFO
 *
 */
class RunnableThread1 implements Runnable {

	Thread runner;
	public RunnableThread1() {
	}
	public RunnableThread1(String threadName) {
		runner = new Thread(this, threadName); // (1) Create a new thread.
		System.out.println(runner.getName());
		runner.start(); // (2) Start the thread.
	}
	public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread());
	}
}

public class RunnableExample1 {

	public static void main(String[] args) {
		RunnableThread1 rt1 = new RunnableThread1();
		Thread thread1 = new Thread(rt1, "thread1");
		Thread thread2 = new Thread(new RunnableThread1(), "thread2");
		new RunnableThread1("thread3");
		//Start the threads
		thread1.start();
		thread2.start();
		try {
			//delay for one second
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	}
}