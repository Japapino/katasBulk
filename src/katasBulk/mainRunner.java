package katasBulk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

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
					map.put(x, a[x]);
				}
			}
		}
		
		List<Integer> index = new ArrayList<>(map.keySet()); 
		if (map.size() == 0){
			return -1;
		}

		int ans = Math.min(index.get(0), index.get(1)); 
		
		if (map.size() == 1){
			return (int) index.get(0);
		}
		
		
		System.out.println(index);

		return (int) map.get(ans); 
	}
}
