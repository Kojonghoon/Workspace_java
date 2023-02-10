package com.ch01;

public class HapExam99 extends Object{

	public static void main(String[] args) {

		int total = 0;
		for (int i=0; i<5; i++) {
			if(i%2==0) {
				total +=i;
			}
		}
		System.out.println(total);
		System.out.println("======");
		
		
		int total1=0;
		int x = 1;
		while(x < 5) {
			if( x % 2 == 0) {
				total1 += x;
			}
			x++;
		}
		System.out.println(total1);
	}
	
}
