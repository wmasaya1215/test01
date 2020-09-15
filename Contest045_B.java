package test001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Contest045_B {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();

		String ans = ans(a, b, c);

		System.out.println(ans);
	}

	public static String ans(String a, String b, String c) {
		// HashMapで初期化
		Map<String, List<String>> map = new HashMap<String, List<String>>() {
			{

				// key,valueを設定
				put("a", new ArrayList<>(Arrays.asList(a.split(""))));
				put("b", new ArrayList<>(Arrays.asList(b.split(""))));
				put("c", new ArrayList<>(Arrays.asList(c.split(""))));
			}
		};

		// 要素aを取得、リストから要素aを削除
		String put = map.get("a").remove(0);

		while (true) {
			// 要素が空の場合trueを返す
			if (map.get(put).isEmpty()) {
				// 最後に取得した要素を返す
				return put.toUpperCase();
			}
			// リストから要素を取得してputに設定、取得した要素をリストから削除
			put = map.get(put).remove(0);
		}
	}
}
