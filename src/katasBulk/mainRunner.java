package katasBulk;

import java.util.HashMap;

public class mainRunner {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 3, 1, 5, 2 };

		int ans = firstDuplicate(numbers);

		System.out.println(ans);

	}

	// static int shapeArea(int n) {
	//
	// int ans = n^(n-1);
	//
	//
	//
	// return ans;
	// }

	static int firstDuplicate(int[] a) {
		HashMap map = new HashMap();

		for (int i = 0; i < a.length; i++) {
			for (int x = i + 1; x < a.length; x++) {
				if (a[i] == a[x]) {
					map.put(i, a[x]);
					System.out.println(a[i] + ", " + a[x]);
				}
			}
		}

		System.out.println(map);

		return -1;
	}
}
