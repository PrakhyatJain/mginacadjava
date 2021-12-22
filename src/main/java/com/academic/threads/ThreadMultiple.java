package main.java.com.academic.threads;

class EvenMultiple implements Runnable {
	Thread t = new Thread();

	public void run() {
		synchronized (this) {
			System.out.println("The Even Numbers");
			for (int i = 2; i <= 25; i++) {
				try {
					Thread.currentThread();
					System.out.println(t.getName() + i);

					if (i == 5 && t.getName().equals("one")) {
						wait();

					}
				} catch (InterruptedException e) {
					System.out.println("InterruptedException");
				}
				try {
					if (i == 10 && t.getName().equals("two")) {
						notify();
						wait();
					}
				} catch (InterruptedException e) {
					System.out.println("InterruptedException");
				}
				if (i == 20 && t.getName().equals("three")) {
					notify();
				}
			}
		}
	}
}

public class ThreadMultiple{// odd
	public static void main(String arg[]) {
		EvenMultiple e = new EvenMultiple();
		Thread t = new Thread(e, "one");
		Thread t1 = new Thread(e, "two");
		Thread t2 = new Thread(e, "three");
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		}
	}
}
