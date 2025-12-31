package com.simple.EX;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
    //역순 출력하기
    //사용자로부터 문자열을 입력받아 반복문을 사용하여 역순으로 출력하시오.
    //(예: "hello" → "olleh")
    //데이터입력
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("문자 입력");
        String name = kbd.nextLine();


    //데이터처리
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }

        

    //데이터출력



    }
}
