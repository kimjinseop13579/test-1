package com.simple.loop;

public class LoopGugudan {

	public static void main(String[] args) {
		// 구구단

		// for
		System.out.println();

		for (int i = 1; i <= 9; i++) {
			//System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"+i+"단");
			System.out.printf("ㅡㅡㅡㅡㅡㅡㅡㅡ %d단 ㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n",i);
			for (int j = 1; j <= 9; j++) {
				// 첫 for문의 i가 두번째 for 문으로 내려와
				// 9번 곱해지고 다시올라가 1이 추가되 다시 내려옴
				System.out.printf("      %2d x %2d = %2d \n", i, j, (i * j));
			
			}
			System.out.println();
			}
		
	}

}
