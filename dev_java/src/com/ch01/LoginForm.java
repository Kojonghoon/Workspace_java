package com.ch01;

public class LoginForm {
	public static String 로그인(String id, String pw) { //static을 붙여서 메소드 호출
		System.out.println("로그인 호출 성공");
		String mem_name = null; // 변수선언만 했다. 초기화는 안했다. null은 모른다. 미정이다.
		mem_name = "강감찬";//6번에서 선언한 변수의 초기화. 디폴트값이 강감찬
		//return "이순신";
		//return id;
		return mem_name;
	}
	//실행순서 14-15-4-5-6-10
	//
	public static void main(String[] args) {
		String rmeme_name = 로그인("tomato", "123");
		//insert here - 강감찬
		//System.out.println(rmeme_name);
		System.out.println(rmeme_name);
		System.out.println(로그인("tomato", "123"));
	}
}
