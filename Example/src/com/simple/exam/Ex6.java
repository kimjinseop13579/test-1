package com.simple.exam;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		//최댓값 구하기 (두 수)

//두 정수를 입력받아 더 큰 수를 출력하세요

		
		//데이터 입력
		int num = 0;
		int num1 = 0;
		Scanner kbd= new Scanner(System.in);
		
		String num2 ="";
	
		System.out.print("숫자1 :");
		num = kbd.nextInt();
	
		System.out.println("숫자2 :");
		num1 = kbd.nextInt();
		
		
		
		//데이터 처리
		
		if(num>num1) {
			num2 = "숫자1"; 
		}else if(num<num1) {
			num2 = "숫자2"; 
		}else if(num==num1) {
			num2 = "같음";
		}
	
		//데이터 출력
		System.out.println("입력된 숫자1 :"+num);
		System.out.println("입력된 숫자2 :"+num1);
		System.out.println();
		System.out.println("결과 :"+num2);
	
	}

}
