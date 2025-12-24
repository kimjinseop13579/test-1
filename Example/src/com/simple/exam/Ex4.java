package com.simple.exam;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		//학점 판별하기

//점수를 입력받아 90점 이상은 A, 80점 이상은 B, 70점 이상은 C, 그 외는 F를 출력하세요.

		
		//데이터 입력
		int num = 0;
		Scanner kbd= new Scanner(System.in);
		String score = "";
		
		System.out.print("점수 :");
		
		num = kbd.nextInt();
		
		//데이터 처리
		
		if(num >= 90) {
			score = "A";
		}else if(num >= 80) {
			score = "B";
		} else if(num >= 70) {
			score = "C";
		} else {
			score = "F";
		}
		
		
		//데이터 출력
		System.out.println("점수 :"+num);
		System.out.println("결과 :"+score);
	}

}
