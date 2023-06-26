package bt01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> myList = getArr();
		System.out.println("Mang: " + myList);
		int max = findMax(myList);
		System.out.println("Max: " + max);
	}
	
	public static List<Integer> getArr() {
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add((int) Math.ceil(Math.random() * 10));
		}
		return arr;
	}
	
	public static int findMax(List<Integer> arr) {
		Collections.sort(arr);
		return arr.get(arr.size() - 1);
	}
}
