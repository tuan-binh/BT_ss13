package bt15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		String max = lines[0];
		for (int i = 0; i < lines.length; i++) {
			if (max.length() < lines[i].length()) {
				max = lines[i];
			}
		}
		System.out.println("Chuỗi liên tiếp lớn nhất là: " + max);
	}
}
