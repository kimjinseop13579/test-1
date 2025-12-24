package com.simple.inout;

import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;

public class VminOut {

	public static void main(String[] args) {
		// 1. 자판기 메뉴 출력
		// 밀크커피(300원)

		// 프로그램에 관련된 입출력 변수 준비
		int inCoin = 0;

		String[] coffeeNames = { "밀크커피", "블랙커피", "설탕커피" };
		int[] coffeePrice = { 300, 200, 100 };
		boolean[] isSale = { false, false, false };

		int menu;
		int vmCoin = 0;
		String coinRepeat = "n";
		String quit = "";

		Scanner kbd = new Scanner(System.in);

		do {

			// 메뉴출력
			// System.out.println(milkCoffe+"("+milkPrice+"원)");
			for (int i = 0; i < coffeeNames.length; i++) {
				System.out.printf("%s:(%d원) %s\n", coffeeNames[i], coffeePrice[i], isSale[i] ? "o" : "x");
			}

			// 동전 입력
			do {
				System.out.print("동전입력 :");
				inCoin += kbd.nextInt();
				kbd.nextLine();

				// 입력한 동전 출력

				System.out.println("잔액 :" + inCoin);
				System.out.println("동전입력 계속하나요? y/n");
				coinRepeat = kbd.nextLine();

				// 밀크커피 판매 가능상태로 변환 처리
				// 입력된 동전이 300원 이상이면 판매가능 상태"ㅇ"로 변경
			} while (coinRepeat.equals("y"));
			
			for (int j=0; j<coffeePrice.length; j++ ) {
			if (inCoin >= coffeePrice[j]) {
				isSale[j] = true;
			}
			}

			// 밀크커피 판매 처리
			// 커피 선택
			// 판매에 따른 처리
			System.out.printf("%s:(%d원) %s\n", coffeeNames, coffeePrice, isSale ? "o" : "x");

			if (isSale[0]) {

				System.out.print("메뉴선택 : 밀크커피 : 1");
				menu = kbd.nextInt();

				switch (menu) {
				case 1:
					// 자판기 판매금액 회수
					vmCoin += coffeeNames;
					inCoin -= coffeePrice[0];
					System.out.println(coffeeNames + "나왔습니다");
				}
				// 밀크커피 상태체크
				if (inCoin >= coffeePrice[0]) {
					isSale[0] = true;

				} else {
					isSale[0] = false;
				}
				System.out.printf("%s:(%d원) %s %d\n", coffeeNames, coffeePrice, isSale ? "o" : "x", inCoin);
				System.out.println("잔액 :" + inCoin);

			}
			kbd.nextLine();// 키보드 버퍼에 남아있는 문자열 처리

			System.out.println("프로그램 종료 : quit 입력");
			quit = kbd.nextLine();
		} while (!quit.equals("quit"));

		System.out.println("자판기 종료");

	}

}
