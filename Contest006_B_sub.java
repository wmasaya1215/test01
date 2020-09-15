package test001;

import java.util.Scanner;

public class Contest006_B_sub extends Contest006_B_super {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int answer = toribonacci(n);
		System.out.println(answer);
	}
}
