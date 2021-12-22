package main.java.com.academic.threads;

class EvenDemo implements Runnable {
	Thread t = new Thread();

	public void run() {
		
		
		System.out.println("The Odd Numbers");
		for (int i = 1; i <= 750; i += 2) {
			
			Thread.currentThread();
			System.out.println(i);
		}
		
		//synchronized (this) {
			System.out.println("The Even Numbers");
			for (int i = 2; i <= 50; i += 2) {
				Thread.currentThread();
				System.out.println(i);
			}
		//}

	}
}

class ThreadSync// odd
{
	public static void main(String arg[]) {
		EvenDemo e = new EvenDemo();
		Thread t = new Thread(e);
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		t.start();
		
		//t1.start();
		//t2.start();
	}
}
