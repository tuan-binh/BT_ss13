package bt05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myList.add(new Scanner(System.in).nextInt());
		}
		
		System.out.print("Nhập vào giá trị tìm kiếm: ");
		int target = new Scanner(System.in).nextInt();
		int index = binarySearch(myList, target);
		if (index == -1) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
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
