package katasBulk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mainRunner {

	public static void main(String[] args) {

		int[] numbers = { 2, 2 };

		int ans = firstDuplicate(numbers);

		System.out.println(ans);

	}

	static int firstDuplicate(int[] a) {
		HashMap map = new HashMap();
		for (int i = 0; i < a.length; i++) {
			for (int x = i + 1; x < a.length; x++) {
				if (a[i] == a[x]) {
					map.put(x, a[x]);
				}
			}
		}

		if (map.size() == 0) {
			return -1;
		}

		List<Integer> index = new ArrayList<>(map.keySet());
		if (map.size() == 1) {
			return (int) map.get(index.get(0));
		}
		int ans = Math.min(index.get(0), index.get(1));

		return (int) map.get(ans);
	}
}
