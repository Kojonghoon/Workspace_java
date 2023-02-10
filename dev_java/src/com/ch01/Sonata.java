package com.ch01;
//자바는 타입을 체크한다. -JDK가 해준다 - 문법체크 - 컴파일 오류
//컴파일 - 고급언어를 저급언어로 바꾸어준다.
// = 대입연산자라고 부른다. 오른쪽에 있는 값을 왼쪾에 대입해 주세요.
public class Sonata {//클래스를 선언하였다. 선언의 이류는 재사용을 위해 = 호출할 수 있다.
	//int와 같이 타입을 나타내는 예약어가 있다 - 어디에?? JDK설치할 수 있다 -> JDK11
	//이 안에는 예약어가 잔뜩 들어있다.
	//변수 선언 ->타입 변수이름 
	//정수형을 담을 수 있는 타입
	int i = 3; //변수 선언 및 초기화를 했다.
	//선언만 하고 싶다 어떡하지?
	//슬래쉬를 두번쓰면 주석으로 취급되어서 문법체크도 없도 실행도 안한다. 누가? JDK
	//int j;//변수 선언만 하고 초기화는 안되어 있다
	//j=5; // 초기화를 하였다. - 에러발생 원인은 선언부에서는 선언과 초기화를 나누어 작성불가함.
	
	// double d = 3.14; double이라는 타입에는 실수도 담는다.
	//메소드 안에서는 변수 선언과 초기화를 분리하여 작성할 수 있다.
	static void methodA() { // 모든 클래스가 호출할수 있다.
		System.out.println("methodA 호출"); //호출순서 : 2번
		//정수형을 담을 수 있는 변수 J를 method 내부에서 선언하였다.
		//지역변수라고 한다.
		//지역변수는 메소드 안에서 선언함
		//메소드 밖에서는 접근이 불가하다
		//메소드 안에서 사용되고 나면 사라진다(메모리에서 비워진다)
		int j;//변수 선언만 하고 초기화는 안되어 있다
		//19번에서 선언된 변수 안에 5라는 값을 담았다 - 이것을 초기화 라고 한다.
		j=5; // 초기화를 하였다. - 에러발생 원인은 선언부에서는 선언과 초기화를 나누어 작성불가함.
	}
	//변수 이름뒤에 ()가 있으면 메소드라고 부른다. - 동사형이다.
	//기능을 담당한다
	//우리는 이클립스에서 코팅을 하고 코딩하는 영역은 반드시 클래스 선언 내부이어야 함
	//클래스 내부에는 메인메소드를 가질 수 있다.
	//메인메소드가 있어야 exe파일로 만들 수 있다.
	//코드 실행시 가장 먼저 호출되는 곳이다.
	//JVM이 자동으로 호출한다.
	public static void login(String id, String pw) {//파라미터 자리는 선언하는 자리이다.
		
		System.out.println(id + ", " + pw);//변수 id를 출력해 주세요//토마토가 출련된다
		
	}
	//main method는 자바에서 제공되는 메소드이다
	//그러므로 바꾸면(리턴타입 or 파라미터타입 ...) 안된다 - 
	// JVM의 호출 순서 42-43-44(18-19-매소드A호출)
	public static void main(String[] args) {//이것을 메인메소드라고 한다
		System.out.println("main 메소드 호출 성공"); //호출순서 : 1번
		methodA();
		//메서드를 호출할 떄 세미콜론으로 끝내고 
		//파라미터가 존재하면 파라미터도 고려해야 하고
		//또한 타입도 고려되어야만 한다.
		//결론: 사용자 정의 메소드 호출시 파라미터와 타입도 맞춰야한다.
		//스태틱 영역에서는 내안의 정의된 메소드라 하더라도 
		//반드시 인스턴스화를 하고 호출해야 한다.
		// 또는 두번째 방법은 methodA()처럼 똑같이 static을 붙여서 선언해라
		login("tomato", "1234" );
		login("apple", "123");
	}
	/*	오늘의 정리
	 * 코딩은 어디에 하나요? 클래스 안(내부)에서 클래스 선언 {..안에...}
	 * 클래스 안에는 메소드를 정의할 수 있다. Sonata {}안에 methodA 들어가있음
	 * println은 자바에서 제공한다? Y 
	 * 메인 메소드의 원형(리턴타입 ,파라미터)을 바꾸면 안됀다 - 컴파일오류발생
	 * method 뒤에 ;이 있다면 메소드 호출
	 * 매소드 뒤에 좌중괄호{}는 선언, ;은 선언
	 * 디버그 모드 쓰는 방법 
	 * -과목과 과목사이의 의존관계가 있어서 최신버전을 사용할 수 없다.
	 * 메서드를 호출할 떄 세미콜론으로 끝내고 
	 * 파라미터가 존재하면 파라미터도 고려해야 하고
	 * 또한 타입도 고려되어야만 한다.
	 */
}