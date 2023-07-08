package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoNemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer>numbers = new ArrayList<>();
		
		System.out.println("Discover numbers with four digits \nthat sum 21 (between 1000 and 9999). \n"
				+ "Define higher digit from 6 to 9:");
		
		System.out.println("vai");
		int mD = sc.nextInt();
		
		for (int num=1000; num<10000; num++) {
			if (maxDigitVerify(num, mD)) {
				maxDigitDefine(num, mD);
				if (numSum(num) == 21) {
					numbers.add(num);
				}
			}
		}
		
		for (Integer number: numbers) {
			System.out.println(number+" = 21");
		}
		sc.close();
	}
	
	private static boolean maxDigitVerify(int num, int mD) {
		while (num > 0) {
			int digit = num % 10;
			if (digit > mD) {
				return false;
			}
			num /= 10;
		}
		return true;
	}
	
	private static void maxDigitDefine(int num, int mD) {
		int maxDigit = 0;
		while(num > 0) {
			int digit = num % 10;
			if (digit > maxDigit) {
				maxDigit = digit;
			}
			num /= 10;
		}
	}
	
	private static Integer numSum(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num % 10;
			num/=10;
		}
		return sum;
	}
}
