package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		int[] avg  = new int[5];
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		for(int i = 0; i<avg.length;i++) {
			avg[i] = sc.nextInt();
			sum += ((double)avg[i] /5);
		}
		System.out.println("평균은 "+ sum + "입니다");
		
		sc.close();
	}
}
