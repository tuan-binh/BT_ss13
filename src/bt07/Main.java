package bt07;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Bạn muốn nhập mấy từ: ");
		int n = sc.nextInt();
		String[] listStr = new String[n];
		for (int i = 0; i < n; i++) {
			listStr[i] = sc.nextLine();
		}
		System.out.print("Nhập vào giá trị bạn muốn tìm: ");
		String value = sc.nextLine();
		int check = -1;
		for (int i = 0; i < n; i++) {
			if (listStr[i].equals(value)) {
				check = i;
			}
		}
		if (check != -1) {
			System.out.println("Có tồn tại vị trí: " + check);
		} else {
			System.out.println("Không tồn tại");
		}
	}
}
