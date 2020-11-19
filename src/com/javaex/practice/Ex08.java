package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		
		for(int i = 0; i <5;i++) {
			
			intArray[i] =  (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i;j++) {
				if(intArray[j] == intArray[i]) {
					i--;
					break;
				}
					
			}
		}
		
		for(int i = 0; i < intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
}
