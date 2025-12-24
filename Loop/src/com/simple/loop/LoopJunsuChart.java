package com.simple.loop;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class LoopJunsuChart {

	public static void main(String[] args) {
		// 점수에 해당하는 별점 표시
		// 점수에 별점을 10으로 나눠서 별점 출력
		
		Scanner kbd = new Scanner(System.in);
		
		
		int kor = 59;
		int bigstar = kor/10;
		int smalstar = kor%10;
		System.out.print("국어 :");
		
		System.out.print("원하는 모양을 입력하세요 :");
		String shape = kbd.nextLine();
		
		for(int i=0; i<bigstar; i++) {
			System.out.print(shape);
		}for(int j=0; j<smalstar; j++) {
			System.out.print("☆");
		}

		//영어
		int eng = 84;
		int Ebigstar = eng/10;
		int Esmalstar = eng%10;
		
		System.out.println();
		System.out.print("영어 :");
		
		System.out.print("원하는 모양을 입력하세요 :");
		shape = kbd.nextLine();
		
		for(int i=0; i<Ebigstar; i++) {
			
			System.out.print(shape);
		}for(int j=0; j<Esmalstar; j++) {
			System.out.print("☆");
		}
		
		
		
		//수학
		int mat = 55;		
		int Mbigstar = mat/10;
		int Msmalstar =mat%10;
		
		System.out.println();
		System.out.print("수학 :");
		
		System.out.print("원하는 모양을 입력하세요 :");
		shape = kbd.nextLine();
		
		
		for(int i=0; i<Mbigstar; i++) {
			System.out.print(shape);
		}for(int j=0; j<Msmalstar; j++) {
			System.out.print("☆");
		}
		
		
	
	
		
	}

}
