package com.github.chapter1;

import java.util.Scanner;

public class MIn4Method {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if (b < min) {
			min = b;
		}
		
		if (c < min) {
			min = c;
		}
		
		if (d < min) {
			min = d;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("비교할 정수값 4개를 적어주세요.");
		System.out.print("1번 정수를 적어주세요 : ");
		int a = scanner.nextInt();
		System.out.print("2번 정수를 적어주세요 : ");
		int b = scanner.nextInt();
		System.out.print("3번 정수를 적어주세요 : ");
		int c = scanner.nextInt();
		System.out.print("4번 정수를 적어주세요 : ");
		int d = scanner.nextInt();
		
		int min = min4(a, b, c, d);
		
		System.out.println("입력한 정수값 중에서 가장 최솟값은 : " + min + "입니다.");
		
		scanner.close();
	}
}
