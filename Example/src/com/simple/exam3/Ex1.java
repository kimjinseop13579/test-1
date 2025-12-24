package com.simple.exam3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 1부터 N까지의 수 중 소수 판별하기
		// 사용자로부터 정수 N을 입력받아 1부터 N까지의 수 
		// 중 소수만 출력하시오.

		
		

		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();

	        for (int i = 2; i <= N; i++) {
	            boolean isPrime = true;

	            for (int j = 2; j <= i - 1; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) System.out.print(i + " ");
	        }
	    }
	
		
		
		

		
		
		
		// 데이터 처리
		
		
		
		

		
		
		// 데이터 출력
		

	}


