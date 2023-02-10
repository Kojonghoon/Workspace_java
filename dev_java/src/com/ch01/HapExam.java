package com.ch01;

class HapExam {
	
	public static void main(String[] args) {
		 //변수 4개 a,b,c,sum
		 int a = 1;
		 int b = 2;
		 int c = 3;
		 //int d = 0;
		 //d= a+ b+ c;
		 int sum = 1+2+3;
		 
		 System.out.println(sum);
		 System.out.println("=========");

		 //변수3개 x,y,z
		 int x = 1;
		 int y = x+1;
		 int z = y+1;

		 System.out.println(x+y+z);
		 System.out.println("=========");
		 
		 //변수 2개 sum, i
		 int sum2 =0;
		 for(int i=0; i<4; i++ ) {
			 sum2 = sum2+i;
		 }
		 System.out.println(sum2);
	}

}
