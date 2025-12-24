package com.simple.operator;

import java.util.Stack;

public class OperatorLiguc {

	public static void main(String[] args) {
		
		// 논리 연산자
		// &&, ||, !
		// 자격증 시험 합격 여부 판단
		// 1차 필기 60점이상이고 2차실기 80점이면, 최종합격
		
		// 입출력 변수 설계(준비)
		int jum1 = 59;  // 1차 필기점수
		int jum2 = 80;  // 2차 필기점수
		//String pass="합격";
		boolean pass; // 합격여부
		
		// 조건 처리
		pass = (jum1 >= 60) && (jum2 >=80);
		
		// 결과 출력
		System.out.println("필기:"+jum1);
		System.out.println("실기:"+jum2);
		System.out.println("합격:"+pass);
		
		
				


	}

}
