package test001;

public class Contest006_B_super {
	public static int toribonacci(int n) {

		int a1 = 0;
		int a2 = 0;
		int a3 = 1;
		int answer = 0;

		for (int i = 0; i < (n - 3); i++) {
			answer = (a1 + a2 + a3) % 10007;
			a1 = a2;
			a2 = a3;
			a3 = answer;
		}
		return answer;
	}
}
