package com.ch01;
// A is a B이다
// 자동차는 소나타이다.
// 소나타는 자동차이다.
public class HapExam4 extends Object{

	public static void main(String[] args) {
		//1부터 3까지 세는 숫자를 담는 변수 선언
		int count = 1;//디폴트 값은 1이다.
		
		//1분터 3까지의 누적된 합을 담는 변수 선언
		int dap = 0;
		dap = count +dap; // 1=1+0
		count = count +1; // count:2
		dap = count +dap; // 3 = 2 + 1
		count = count +1; // count:3
		dap = count +dap; // 6 = 3 + 3
		count = count +1; // count:4
		dap = count +dap; // 10= 6 + 4
		count = count +1; // count:5
		dap = count +dap; // 15 = 5 + 10
		count = count +1; // count:6
		dap = count +dap; // 21 = 6 + 15
		System.out.println(dap);
	}

}
