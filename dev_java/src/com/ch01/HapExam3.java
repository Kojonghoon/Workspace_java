package com.ch01;
// A is a B이다
// 자동차는 소나타이다.
// 소나타는 자동차이다.
public class HapExam3 extends Object{

	public static void main(String[] args) {
		int i=1;
		System.out.println(i++ + "," + i++ + "," + i );
		int j=0;
		System.out.println((j+=1)+ "," +(j+=1) + "," +(j+=1));
		int x=0;
		System.out.println((x=x+1)+ "," +(x=x+1)+ "," + (x=x+1) );
	}

}
