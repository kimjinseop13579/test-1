package com.simple.EX;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
//        자리수 합 구하기
//        사용자로부터 정수를 입력받아 각 자리수를 모두 더한 합을 출력하시오.
//        (예: 123 → 1+2+3=6)
        Scanner kbd = new Scanner(System.in);

        //데이터 입력

        System.out.print("숫자를 입력하십시오 :");
        String num1 = kbd.nextLine();
//        char num2 = num1.charAt(0);
//        char num3 = num1.charAt(1);
//        char num4 = num1.charAt(2);
//        char num5 = num1.charAt(3);



        //데이터 처리
        String a1 = num1.substring(0,1);
        String a2 = num1.substring(1,2);
        String a3 = num1.substring(2,3);


        int aa1 = Integer.parseInt(a1);
        int aa2 = Integer.parseInt(a2);
        int aa3 = Integer.parseInt(a3);


        System.out.println(aa1+aa2+aa3);


        //데이터 출력


    }
}
