package com.ch01;

public class Variable4 {
	int age = 30;	// 인스턴스 변수(전역 변수)
	
	static int age2 = 30; // 클래스 변수(전역 변수)
	
	public static void main(String[] args) {
	    // static - 공유가능
		// 인스턴스화 없이도 호출 가능하다.
		Variable1 method = new Variable1();	//인스턴스화 
		//클래스의 구성요소는 명사형(변수)와 동사형(메소드)가 있다.
		//내안의 선언된 메소드라 하더라도 메인 메소드 안에서
		//호출 할 때에는 인스턴스화를 해야만 한다. 
		method.methodA();
		
		methodB();
	}
	
	 void methodA() {
		System.out.println(age);
	}	
	
	 static void methodB() {
		 System.out.println(age2);
	 }
} 