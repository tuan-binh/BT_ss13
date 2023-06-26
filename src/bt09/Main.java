package bt09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = getArr();
		myList.sort((o1, o2) -> o1 - o2);
		System.out.print("Nhập min: ");
		int low = sc.nextInt();
		System.out.print("Nhập max: ");
		int high = sc.nextInt();
		System.out.print("Nhập giá trị bạn muốn tìm");
		int target = sc.nextInt();
		int index = binarySearch(myList, low, high, target);
		if (index == -1) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
	}
	
	public static List<Integer> getArr() {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add((int) Math.ceil(Math.random() * 10));
		}
		return arr;
	}
	
	public static int binarySearch(List<Integer> list, int low, int high, int target) {
		int mid = (low + high) / 2;
		if (list.get(mid) == target) {
			return mid;
		} else if (list.get(mid) < target) {
			return binarySearch(list, high, mid - 1 , target);
		} else if (list.get(mid) > target) {
			return binarySearch(list, mid + 1, low , target);
		} else {
			return -1;
		}
	}
}
