package com.sangs.s1;

import java.util.Scanner;



public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int [] ar = new int[26];
	int max = 0;
	int count=0;
	char result =' ';
	// array > a 4,b 2,c 3,d 2
	//a=97 A=65 67-65=2
	s = s.toUpperCase();
	for(int i=0;i<ar.length;i++) {
		ar[i] = 0;
	}
	for(int i=0;i<s.length();i++) {
		 ar[s.charAt(i)-65]++ ;		
	}
	max = ar[0];
	for(int i=0;i<ar.length;i++) {
		
		if(ar[i]>max) max = ar[i];
	}
	
	
	
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==max) {
				result = (char)(i+65);
				count++;
			}
		}
		if(count>1) result='?';
		

//	}
	System.out.println(result);
}	
	}


