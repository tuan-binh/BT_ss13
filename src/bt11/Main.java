package bt11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Double> myList = getArr();
		System.out.println("Mang: " + myList);
		double target = new Scanner(System.in).nextDouble();
		double index = findTarget(myList, target);
		if (index == -1) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
	}
	
	public static List<Double> getArr() {
		List<Double> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add(Math.ceil(Math.random() * 10));
		}
		return arr;
	}
	
	public static double findTarget(List<Double> arr, double target) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) == target) {
				return i;
			}
		}
		return -1;
	}
}
