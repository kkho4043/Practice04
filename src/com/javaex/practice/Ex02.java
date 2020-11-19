package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		double[] doubleArray = new double[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i < doubleArray.length;i++) {
			doubleArray[i] =  sc.nextDouble();
		}
		
		for(int i = 0;i < doubleArray.length;i++) {
			System.out.println(doubleArray[i]);
		}
		sc.close();
	}
}
