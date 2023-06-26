package bt13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào một chuỗi: ");
		String inputString = scanner.nextLine();
		
		String longestIncreasingSubstring = findLongestIncreasingSubstring(inputString);
		System.out.println("Chuỗi tăng dần có độ dài lớn nhất: " + longestIncreasingSubstring);
	}
	
	public static String findLongestIncreasingSubstring(String inputString) {
		if (inputString.isEmpty()) {
			return inputString;
		}
		
		int n = inputString.length();
		int[] dp = new int[n];
		dp[0] = 1;
		int maxLength = 1;
		int endIndex = 0;
		
		for (int i = 1; i < n; i++) {
			dp[i] = 1;
			if (inputString.charAt(i) > inputString.charAt(i - 1)) {
				dp[i] = dp[i - 1] + 1;
			}
			if (dp[i] > maxLength) {
				maxLength = dp[i];
				endIndex = i;
			}
		}
		
		return inputString.substring(endIndex - maxLength + 1, endIndex + 1);
	}
}
