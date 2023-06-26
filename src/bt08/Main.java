package bt08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = getArr();
		System.out.println("Mảng: " + myList);
		System.out.print("Min: ");
		int min = sc.nextInt();
		System.out.print("Max: ");
		int max = sc.nextInt();
		System.out.print("Target: ");
		int target = sc.nextInt();
		
		List<Integer> index = getIndex(myList, min, max, target);
		if (index.size() == 0) {
			System.out.println("Không tồn tại");
		} else {
			System.out.println("Có tồn tại vị trí index: " + index);
		}
		
	}
	
	public static List<Integer> getArr() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random() * 100));
		}
		return list;
	}
	
	public static List<Integer> getIndex(List<Integer> list, int min, int max, int target) {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = min; i < max; i++) {
			if (list.get(i) == target) {
				myList.add(list.get(i));
			}
		}
		return myList;
	}
}
