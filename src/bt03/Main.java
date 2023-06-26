package bt03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] myArr = getArr();
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(myArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Nhập vào giá trị bạn muốn tìm: ");
		int value = new Scanner(System.in).nextInt();
		int[] point = findNumber(myArr, value);
		if (point == null) {
			System.out.println("Không tồn tại giá trị đó");
		} else {
			System.out.println("Có tồn tại " + point[0] + " và " + point[1]);
		}
	}
	
	public static int[][] getArr() {
		int array[][] = new int[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				array[i][j] = (int) Math.ceil(Math.random() * 10);
			}
		}
		return array;
	}
	
	public static int[] findNumber(int[][] array, int target) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				if (array[i][j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}
}
