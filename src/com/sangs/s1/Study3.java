package com.sangs.s1;

public class Study3 {

	public static void main(String[]args) {
		System.out.println("프로그램 시작");
		int num1=30;
		long num2=50L;
		
		num2=num1;
		
		num1=(int)num2;
		float f1 = num2;
		num2 = (long)f1;
		
		num1 = 33;
		
		num1 = num1/2;
		
		System.out.println(num1);
		f1 = 33.5F/2;
		f1 = num2/2F;
		System.out.println(f1);
		
		System.out.println("================================================================");
		int sum=100;
		int count = 3;
		double result = 0;
		result = (double)sum / count;
		result = (double)((int)((double)sum/count*100))/100;
		System.out.println(result);
		System.out.println("프로그램 종료");
		
		 
	}
	
}
