package com.simple.exam;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// 요일 출력하기

//1~7 사이의 숫자를 입력받아 1은 월요일, 2는 화요일 … 7은 일요일을 출력하세요.
		
		//데이터 입력
		int num = 0;
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("숫자입력 :");
		num = kbd.nextInt();
		
		final int NUM = 7;
		
		
		
		
		//데이터 처리
		
		if(num == 1) {
			result = "월"; 
		}else if(num == 2) {
			result = "화"; 
		}else if(num == 3) {
			result = "수"; 
		}else if(num == 4) {
			result = "목"; 
		}else if(num == 5) {
			result = "금"; 
		}else if(num == 6) {
			result = "토"; 
		}else if(num == 7) {
			result = "일"; 
		}
		
		
		
		
		
		//데이터 출력
		System.out.println("입력된 숫자 :"+num);
		System.out.println("요일 :"+result);
		
		

	}

}
