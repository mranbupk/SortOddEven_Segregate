package co.anbu;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				even.add(arr[i]);
			} else if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}
		for (int i = 0; i < even.size(); i++) {
			for (int j = i + 1; j < even.size(); j++) {
				if (even.get(i) > even.get(j)) {
					int temp = even.get(i);
					even.set(i, even.get(j));
					even.set(j, temp);

				}
			}
		}
		System.out.println(even);
		for (int i = 0; i < odd.size(); i++) {
			for (int j = i + 1; j < odd.size(); j++) {
				if (odd.get(i) < odd.get(j)) {
					int temp = odd.get(i);
					odd.set(i, odd.get(j));
					odd.set(j, temp);

				}
			}
		}
		System.out.println(odd);
		int count = 0;
		int count1 = 0;
		if (odd.size() == even.size()) {
			for (int i = 0; i < n; i++) {

				if (i == 0) {
					result.add(even.get(i));
					count++;
				} else if (i % 2 == 0) {
					result.add(even.get(count));
					count = count + 1;
				} else {
					result.add(odd.get(count1));
					count1 = count1 + 1;

				}

			}
		} else {
			if (odd.size() > even.size()) {
				for (int i = 0; i < even.size() * 2; i++) {
					if (i == 0) {
						result.add(even.get(i));
						count = count + 1;
					} else if (i % 2 == 0) {
						result.add(even.get(count));
						count = count + 1;
					} else {
						result.add(odd.get(count1));
						count1 = count1 + 1;

					}
				}
				for (int i = count; i < odd.size(); i++) {
					result.add(odd.get(count1));
					count1 = count1 + 1;
				}

			} else {
				for (int i = 0; i < odd.size() * 2; i++) {
					if (i == 0) {
						result.add(even.get(i));
						count = count + 1;
					} else if (i % 2 == 0) {
						result.add(even.get(count));
						count = count + 1;
					} else {
						result.add(odd.get(count1));
						count1 = count1 + 1;

					}
				}
				for (int i = count; i < even.size(); i++) {
					result.add(even.get(count));
					count = count + 1;
				}
			}
		}
		System.out.println(result);
	}

}
