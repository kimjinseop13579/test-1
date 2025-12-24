package com.simple.loop;

public class LoopFor {

	public static void main(String[] args) {
		// for : 정해진 횟수만큼 반복
		// 1,2,3,4,5,6,7,8,9,10

		int i;
		for (i = 0; i < 10; i++) {
			System.out.println("i : " + i);
		}
		i = 0;
		while (i < 10) {
			i++;
			System.out.println("i :" + i);
		}

		// 1부터 n 까지의 숫자를 더해가면서 그의 합이 100이상이
		// 될때까지 반복하시오.
		i = 0;
		int sum = 0;
		int count = 0;
		int finalcount = 0;
		while (sum < 100) {
			sum = sum + i;
			System.out.println("합계 :" + sum);
			System.out.println("i :" + i);
			i++;
			finalcount = count++; // count = count + 1; count += 1;
		}
		
		//반복횟수 출력
		System.out.println("반복횟수"+count);
		System.out.println("최종반복횟수"+finalcount);

	}

}
