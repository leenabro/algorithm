package com.github.chapter1;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int n = scanner.nextInt();
		
//		if (n > 0) {
//			System.out.println("이 수는 양수입니다.");
//		} else if (n < 0) {
//			System.out.println("이 수는 음수입니다.");
//		} else {
//			System.out.println("이 수는 0입니다.");
//		}
		
		String result = n > 0 ? "양수" : n < 0 ? "음수" : "0";
		System.out.printf("이 수는 %s입니다.", result);
		
		scanner.close();
	}
	
}
