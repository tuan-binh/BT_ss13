package bt06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> myList = getArr();
		System.out.println("Mảng: " + myList);
		System.out.println("Bạn muốn tìm giá trị nào: ");
		int value = new Scanner(System.in).nextInt();
		int index = binarySearch(myList, value);
		if (index == -1) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
	}
	
	public static List<Integer> getArr() {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add((int) (Math.random() * 100));
		}
		return arr;
	}
	
	public static int binarySearch(List<Integer> list, int target) {
		int low = 0;
		int high = list.size() - 1;
		while (high >= low) {
			int mid = (high + low) / 2;
			if (list.get(mid) > target) {
				high = mid - 1;
			} else if (list.get(mid) < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
