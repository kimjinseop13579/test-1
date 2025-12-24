package com.simple.exam2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// BMI 계산기

//키(cm)와 몸무게(kg)를 입력받아 BMI를 계산하고, 정상/과체중/저체중을 판별하세요.
//키를 170으로 입력하면 cm이므로 나누기 100을 하여 1.7을 구해서 단위를 m로 변경해야 합니다.
//BMI = 몸무게(kg) ÷ (키(m) × 키(m))
		

		//데이터 입력
		int cm = 0;
		int kg = 0;
		String BMI = "";
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("키 :");
		cm = kbd.nextInt();
		System.out.print("몸무게 :");
		kg = kbd.nextInt();
		
		
		//데이터 처리
		double M = (double)cm / 100 ;
		double bmi = kg / ( M * M );
		
		
		//데이터 출력
		System.out.print("BMI :");
		System.out.printf("%1.2f",bmi);

	}

}
