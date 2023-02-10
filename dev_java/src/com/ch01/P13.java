package com.ch01;

public class P13 {

	public static void main(String[] args) {
		System.out.println(5+0.5);//상수로 하였다. 변수로 사용하지 않은 코드임.
		byte b=5;
		float f= 0.5f;
		//byte + float =>float
		//byte - float => float ->int-float연산을 함
		System.out.println(b+f); //변수를 사용하였다.
		System.out.println(275); //변수를 사용하였다.
		System.out.println(275/3);//int/int ->int
		System.out.println(275/3.0);//int/double ->double
		System.out.println(275.0/3);//double/int ->double
		System.out.println(275.0/3.0);//double/double ->double

		int x= (int) 3.0;
		System.out.println(x);
		System.out.println(x+1);
		System.out.println(x+1.0);
	
	}

}