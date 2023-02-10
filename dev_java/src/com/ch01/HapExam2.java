package com.ch01;
// A is a B이다
// 자동차는 소나타이다.
// 소나타는 자동차이다.
public class HapExam2 extends Object{

	public static void main(String[] args) {
		int i=1;
		//증가연산자가 뒤에 있으면 먼저 출력하고 1을 증가하라는 의미임.
		System.out.println(i++ + "," + i++ + "," + i );
		int j=0;
		// +=은 덧셈을 먼저하고 대입하라는 의미. j=j+1과 같은뜻
		System.out.println((j+=1)+ "," +(j+=1) + "," +(j+=1));
		int x=0;
		System.out.println((x=x+1)+ "," +(x=x+1)+ "," + (x=x+1) );
	}

}
