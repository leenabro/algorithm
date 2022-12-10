package com.github.chapter1;

import java.util.Scanner;

public class Min3Method {
	static int min3(int a, int b, int c) {
		int min = a;
		
		if (b < min) {
			min = b;
		}
		
		if (c < min) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("비교할 최솟값 3개를 적으세요.");
		System.out.print("1번 정수 : ");
		int a = scanner.nextInt();
		System.out.print("2번 정수 : ");
		int b = scanner.nextInt();
		System.out.print("3번 정수 : ");
		int c = scanner.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("적으신 정수중의 최솟값은 : " + min + "입니다.");
		
		scanner.close();
	}
	
}
