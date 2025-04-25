package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		double sum=0;
		
		double[] num = new double[5];
		
		num[0] = sc.nextDouble();
		num[1] = sc.nextDouble();
		num[2] = sc.nextDouble();
		num[3] = sc.nextDouble();
		num[4] = sc.nextDouble();
		
		
		for(i=0; i<num.length; i++) {
			
			sum = sum + num[i];
		}
		
		System.out.println("평균은 " + sum/i + "입니다.");
		
		
		sc.close();
	}
	
}
		
		
		
