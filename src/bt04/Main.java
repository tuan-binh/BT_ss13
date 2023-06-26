package bt04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("Nhập vào số phần tử: ");
		int n = new Scanner(System.in).nextInt();
		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			myList.add(new Scanner(System.in).nextInt());
		}
		System.out.println("Mảng: " + myList);
		System.out.print("Nhập giá trị bạn muốn tìm: ");
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
