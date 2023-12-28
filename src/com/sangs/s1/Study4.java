package com.sangs.s1;

public class Study4 {
	public static void main(String[]args) {
		
		int money = 50000;
		int pay = 12580;
		
		int jandon = 0;
		
		jandon = money - pay;
		System.out.println("잔돈 : " + jandon);
		int man;
		int cheon;
		int bak;
		int sip;
		man = jandon/10000;
		jandon = jandon - (man *10000);
		cheon = jandon/1000;
		jandon = jandon - (cheon *1000);
		bak = jandon/100;
		jandon = jandon - (bak *100);
		sip = jandon/10;
		
		
		
		
		System.out.println("만원 : " + man);
		System.out.println("천원 : " + cheon);
		System.out.println("백원 : " + bak);
		System.out.println("십원 : " + sip);
		
		
		
	}
}
