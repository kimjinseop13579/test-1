package com.simple.array;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열 초기화
		int[] score = { 10, 20, 50, 60, 78 };

		for (int i : score) {
			System.out.print(i + " ");
		}

		System.out.println();
		// 문자열 배열 초기화
		String [] topping = 
			{"버섯","양파","소세지","베이컨","토마토"};
		for(String str : topping ) {
			System.out.print(str+" ");
		}
		
		// 문자열을 배열로 다루기
		String str = "Hello Java";
		
		System.out.println(str);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		

		// 문자열을 배열로 다루기
		String jumin = "000502-3725117";
		
		int year = 2000 +                                 
		Integer.parseInt(jumin.substring(0,2)) ;
				
		System.out.println(jumin);
		System.out.println(year);
		
				
	}

}
