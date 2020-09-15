package test001;

import java.util.Scanner;

public class Contest156_B {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int c = digits(N, K);

		System.out.println(c);
	}

	public static int digits(int N, int K) {
		int count = 1;

		while (N >= K) {
			N /= K;
			count++;
		}
		return count;
	}
}

// atcoder提出用
/*import java.util.Scanner;

public class Test002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int count = 1;
		while (N >= K) {
			N = N / K;
			count++;
		}
		System.out.println(count);
		return ;
	}
}*/