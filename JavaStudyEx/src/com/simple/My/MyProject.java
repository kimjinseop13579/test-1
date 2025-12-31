package com.simple.My;
import java.util.Scanner;
import java.util.Random;


public class MyProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎯 숫자 맞추기 게임 (1~10)");
        System.out.println("0을 입력하면 게임 종료");

        while (true) {
            System.out.print("\n숫자를 입력하세요: ");
            int user = sc.nextInt();

            // 종료 조건
            if (user == 0) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            // 입력값 검사
            if (user < 1 || user > 10) {
                System.out.println("1~10 사이의 숫자만 입력하세요.");
                continue;
            }

            int computer = random.nextInt(10) + 1;

            System.out.println("내가 입력한 숫자: " + user);
            System.out.println("랜덤 숫자: " + computer);

            // 결과 비교
            if (user == computer) {
                System.out.println("🎉 당첨!");
            } else {
                System.out.println("❌ 실패");
            }
        }

        sc.close();
    }

}
