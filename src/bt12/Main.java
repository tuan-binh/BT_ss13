package bt12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào số phần tử: ");
		List<Double> myList = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử thứ " + (i + 1));
			myList.add(sc.nextDouble());
		}
		System.out.print("Nhập vào số bạn muốn tìm: ");
		double target = sc.nextDouble();
		int index = binarySearch(myList, target);
		if (index == -1) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
	}
	
	public static int binarySearch(List<Double> list, double target) {
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
