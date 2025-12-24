package com.simple.exam;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 양수/음수/0 판별하기
		// 정수를 입력받아 양수, 음수, 0 중 어떤 값인지 출력하세요.

		// 데이터 입력
		int num1 = 0;
		int num2 = 0;
		int max = 0;
		String result = "";
		Scanner kbd = new Scanner(System.in);

		System.out.print("숫자1입력 :");
		num1 = kbd.nextInt();

		System.out.print("숫자2입력 :");
		num2 = kbd.nextInt();

		// 데이터 처리
		// int max = (num1 > num2)? num1 : num2;
		if(num1 > num2) {
			max = num1;
		}else {
			max = num2;
		}

		// 데이터 출력
		System.out.println("큰수 :" + max);

	}

}
