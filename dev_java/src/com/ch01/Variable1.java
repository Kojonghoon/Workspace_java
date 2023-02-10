package com.ch01;
//변수의 종류
//1. 원시형 변수 - 호출하면 값이 나옴
//2. 참조형 변수 - 호출하면 주소번지가 나옴(@abcd1234) - 클래스타입은 모두 참조형이다
//3. 동적변수 Static
public class Variable1 {//클래스 선언
	//선언부 - 코딩하는 위치가 xxx이면 전역변수(멤버변수)이다.
	//변수 선언하기
	//타입변수명(직관적인이름, age, memberID, emil...)
	int age = 30; //변수선언 + 초기화
	//이름뒤에 괄호가 있으면 메소드이다.
	//나는 메소드를 선언{중괄호}할 수 있다.
	//메소드를 호출할 땐 세미콜론 ;
	//메소드 안에 메소드를 선언할 수 없다.
	public static void main(String[] args) {
		//메소드 중괄호 안에 선언하면 지역변수(local variable, automatic variable: 메소드 안에서만 사용이 가능함, 메소드 내에서만 호출가능)
		int age =5; //지변
		//insert here methodA를 호출해보세요
		//static이 있는 메소드 안에서 static이 없는 메소드를 호출할 수 없다.
		//그런데 꼭 하고싶다면 인스턴스화를 하면 가능하다. - 문제해결 능력
		Variable1 v1 = null;//클래스 선언법- 참조형변수 -> 클래스를 선언만 하였다. 의미, 실제로 객체는 만들어지지 않았다.
		v1 = new Variable1(); // 이 떄 비로서 객체가 생성됨 - heap메모리 영역에 로딩이 된다. -> 메모리에 있으니 호출이 가능하다 -> 재사용할 수 있다.
		v1.age=7;
		v1.methodA(); //methodA의 소유주 variable1
		
	}

	void methodA() {
		 System.out.println(age);// 30 -전역변수가 출력되었다.?
		 //5를 출력하고 싶어요 가능할까요?
	}
}
