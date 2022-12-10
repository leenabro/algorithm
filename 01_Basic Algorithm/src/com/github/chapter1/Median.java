package com.github.chapter1;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("비교할 정수값 3개를 적어주세요.");
		System.out.print("1번 정수를 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.print("2번 정수를 입력하세요 : ");
		int b = scanner.nextInt();
		System.out.print("3번 정수를 입력하세요 : ");
		int c = scanner.nextInt();
		
		int med = med3(a, b, c);
		System.out.println("정수값 중에서 중간 값은 : " + med + "입니다.");
		
		scanner.close();
	}
}
