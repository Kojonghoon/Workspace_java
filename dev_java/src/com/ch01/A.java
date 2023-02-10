package com.ch01;

public class A {
	double pi =3.14;//전역변수 - heap영역에 존재
	public static void main(String[] args) {
		double pi = 5.1;//지역변수 - 스택영역에 존재
		//insert here -전역변수 출력해주세요.
		A a = new A();
		System.out.println(pi); // 5.1 지역변수
		System.out.println(a.pi); // 3.14 전역변수
	}

}

