package com.ch01;
// A is a B이다
// 자동차는 소나타이다.
// 소나타는 자동차이다.
public class HapExam6 extends Object{
	//1부터 5까지의 짝수의 합 혹은 홀수의 합을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		//1부터 3까지 세는 숫자를 담는 변수 선언
		int count = 1;//디폴트 값은 1이다.
		//1분터 5까지의 누적된 홀수의 합을 담는 변수 선언
		int dap = 0;
		//1부터 5까지의 홀수의 합을 구할때는 연산을 3번 반복해야 한다.
		//만익 짝수의 합을 구하는 거라면 연산은 2번만 반복하면 됨.
		dap = count +dap; // 1=1+0
		count = count +2; // count:3
		dap = count +dap; // 4 = 3 + 1
		count = count +2; // count:5
		dap = count +dap; // 9 = 4 + 5
		count = count +2; // count:7
		//만약에 count가 5보다 크면 연산하지 말것
		if(count>7){
			System.out.println("여기로 들어오면 [count가 5보다 크면] 출력됨===>"+ count);
			return;//이 조건을 만족하면 main메소드를 빠져 나가라
		}
		dap = count +dap; // 16 = 9 + 7
		
		System.out.println(dap);
	}

}
