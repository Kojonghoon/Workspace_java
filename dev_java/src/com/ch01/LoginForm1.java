package com.ch01;

public class LoginForm1 {
	public String 로그인(String id, String pw) {
		System.out.println("로그인 호출 성공");
		String mem_name = null; // 변수선언만 했다. 초기화는 안했다. null은 모른다. 미정이다.
		mem_name = "강감찬";//6번에서 선언한 변수의 초기화. 디폴트값이 강감찬
		return mem_name;
	}
	void methodA() {
		로그인("tomato", "123");
	}
	//괄호가 있으면 메소드 이거나 생성자이다.
	public static void main(String[] args) {
		//static 영역안에서 non-static 메소드는 호출이 불가함
		LoginForm1 loginForm1 = new LoginForm1(); //생성자
		
		String rmeme_name = loginForm1.로그인("tomato", "123"); //인스턴스화해서 메소드 호출
		//insert here - 강감찬
		System.out.println(rmeme_name);
		System.out.println("==========");
		String rmeme_name1 = loginForm1.로그인("rose", "12345");
		System.out.println(rmeme_name1);
	}
}
