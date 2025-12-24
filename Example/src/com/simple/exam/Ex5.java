package com.simple.exam;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		//최댓값 구하기 (세 수)

  //세 정수를 입력받아 가장 큰 수를 출력하세요.

		
		//데이터 입력
		int num = 0;
		int num1 = 0;
		int num2 = 0;
		Scanner kbd= new Scanner(System.in);
		
		String re ="";
	
		System.out.print("숫자1 :");
		num = kbd.nextInt();
		System.out.print("숫자2 :");
		num1 = kbd.nextInt();
		System.out.print("숫자3 :");
		num2 = kbd.nextInt();
		
		
		
		
		//데이터 처리
		
		
		
		if(num>num1 && num>num2) {
			re = "숫자1"; 
		}else if(num<num1 && num2 < num1) {
			re = "숫자2"; 
		}else if(num<num2 && num2>num1) {
			re = "숫자3";
		}
	
		//데이터 출력
		System.out.println("입력된 숫자1 :"+num);
		System.out.println("입력된 숫자2 :"+num1);
		System.out.println("입력된 숫자3 :"+num2);
		System.out.println("결과 :"+re);
	
	}

}
