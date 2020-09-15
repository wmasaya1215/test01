package test001;

import java.util.Scanner;

public class Contest116_B {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int count = 0;
		int count2 = 0;

		int ans = collatzProblem(s, count, count2);
		System.out.println(ans);
	}

	public static int collatzProblem(int s, int count, int count2) {

		while (count2 < 2) {
			count += 1;
			if (s == 4) {
				count2 += 1;
			}
			//偶数の場合
			if (s % 2 == 0) {
				s /= 2;
			//奇数の場合
			} else {
				s = s * 3 + 1;
			}
		}
		return count;
	}
}
