package rajeeSanProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencySort {

	public static void main(String[] args) {
//		int[] nums= {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		int[] nums= {4, 6, 8, 2, 5, 7, 9};
		Map<Integer, Integer> m = new HashMap<>();
		new FrequencySort().findFrequency(nums, m);
		List<Map.Entry<Integer, Integer>> l = new ArrayList<>(m.entrySet());
		Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if(o1.getValue()==o2.getValue()) {
					return o1.getKey()-o2.getKey();
				}
				return o2.getValue()-o1.getValue();
			}
		});
		int j=0;
		for (Entry<Integer, Integer> e : l) {
			for(int i=0;i<e.getValue();i++) {
				nums[j++]=e.getKey();
			}
		}
		System.out.println(Arrays.toString(nums));
	}
	public void findFrequency(int[] nums, Map<Integer, Integer> m) {
		for (int i = 0; i < nums.length; i++) {
			if (m.containsKey(nums[i])) {
				m.put(nums[i], m.get(nums[i]) + 1);
			} else {
				m.put(nums[i], 1);
			}
		}
	}
}
