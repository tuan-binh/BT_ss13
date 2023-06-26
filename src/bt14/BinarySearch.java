package bt14;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>(Arrays.asList(2, 1, 6, 8, 3, 8, 0, 2, 9, 10));
		Collections.sort(myList);
		System.out.println("Mảng: " + myList);
		System.out.println("Nhập vào số bạn muốn tìm: ");
		int target = new Scanner(System.in).nextInt();
		int index = binarySearch(myList, 0, myList.size() - 1, target);
		if (index == -1) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
	}
	
	public static int binarySearch(List<Integer> list, int low, int high, int target) {
		int mid = (low + high) / 2;
		if (list.get(mid) == target) {
			return mid;
		} else if (list.get(mid) < target) {
			return binarySearch(list, mid + 1, high, target);
		} else if (list.get(mid) > target) {
			return binarySearch(list, low, mid - 1, target);
		} else {
			return -1;
		}
	}
}
