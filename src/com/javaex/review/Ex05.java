package com.javaex.review;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[5];
		
		
		double sum = 0;
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextDouble();
			sum = sum + num[i];
		}
		
		System.out.println("평균은 "+ sum/num.length + "입니다.");
		
		
		//이게 맞는듯
		
		
		sc.close();
	}
}
