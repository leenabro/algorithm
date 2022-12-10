package com.kh.sorting;

public class SelectSort {
	public static void main(String[] args) {
		int[] iArray = {6, 2, 1, 7, 8, 9, 3, 5, 4};
		int tmp;
		int indexMin;
		
		for (int i = 0; i < iArray.length - 1; i++) {
			indexMin = i;
			for (int j = i + 1; j < iArray.length; j++) {
				if(iArray[j] < iArray[indexMin]) {
					indexMin = j;
				}
			}
			tmp = iArray[indexMin];
			iArray[indexMin] = iArray[i];
			iArray[i] = tmp;
			
		}
		
		
		for (int i : iArray) {
			System.out.print(i + " ");
		}
		
	}
}
