package com.simple.operator;

import java.util.Stack;

public class OperatorLiguc2 {

	public static void main(String[] args) {
		
		// 논리 연산자
		// &&, ||, !
		// 자격증 시험 합격 여부 판단
		// 1차 필기 60점이상이고 과목은 국어,영어,수학
		//과목점수는 최소 40점이상
		
		// 입출력 변수 설계(준비)
		int kor = 60;  
		int eng = 60;  
		int mat = 60; 
		double avg; 
		
		//String pass="합격";
		boolean pass1; // 과목과락
		boolean pass2; // 필기합격
		
		// 과목과락 체크
		pass1 = (kor>=40) && 
				(eng>=40) &&
				(mat>=40);
		
		
		//평균점수
		avg = (double)(kor+eng+mat)/3;
		pass2 = pass1 && avg >= 60;
		
		// 결과 출력
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+mat);
		System.out.println("평균:"+avg);
		System.out.println("과락:"+pass1);
		System.out.println("합격:"+pass2);
		
		
				


	}

}
