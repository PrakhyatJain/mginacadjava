package main.java.com.academic.basic;
public class ArrayDemo {

	public static void main(String arg[]) {
		int twoD[][] = new int[4][5];
		int i, j, k = 0;
		for (i = 0; i < 4; i++)
			for (j = 0; j < 1; j++) {
				twoD[i][j] = k;
				k=k+1;
			}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
	}
}
