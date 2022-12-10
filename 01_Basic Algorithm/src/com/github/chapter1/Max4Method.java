package com.github.chapter1;

import java.util.Scanner;

public class Max4Method {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) {
			max = b;
		} 
		
		if (c > max) {
			max = c;
		} 
		
		if (d > max) {
			max = d;
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("최댓값을 비교할 정수 4개를 적으세요.");
		System.out.print("1번 정수 : ");
		int a = scanner.nextInt();
		System.out.print("2번 정수 : ");
		int b = scanner.nextInt();
		System.out.print("3번 정수 : ");
		int c = scanner.nextInt();
		System.out.print("4번 정수 : ");
		int d = scanner.nextInt();
		
		int max = max4(a, b, c, d);
		System.out.println("입력하신 정수값 중에 가장 큰 값은 : " + max + "입니다.");
		
		scanner.close();
	}
}
