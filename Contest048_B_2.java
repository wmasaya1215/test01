package test001;

import java.util.Scanner;

public class Contest048_B_2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long answer = between(a, b, x);
		System.out.println(answer);
	}

	public static long between(long a, long b, long x) {
		long ans;
		if (a == 0) {
			ans = b / x;
			ans += 1;
		} else {
			ans = (b - (b % x) - a - (a % x)) / x;
			ans += 1;
		}
		return ans;
	}
}
