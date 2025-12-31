package com.simple.thread;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DealClock {
    public static void main(String[] args) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        // 🇰🇷 한국 시간 쓰레드
        Thread koreaClock = new Thread(() -> {
            while (true) {
                LocalDateTime nowKorea =
                        LocalDateTime.now(ZoneId.of("Asia/Seoul"));
                System.out.println("[한국시간] " + nowKorea.format(formatter));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });

        // 🇺🇸 미국(뉴욕) 시간 쓰레드
        Thread usClock = new Thread(() -> {
            while (true) {
                LocalDateTime nowUS =
                        LocalDateTime.now(ZoneId.of("America/New_York"));
                System.out.println("[미국시간] " + nowUS.format(formatter));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });

        // 데몬 쓰레드 설정
        koreaClock.setDaemon(true);
        usClock.setDaemon(true);

        // 쓰레드 시작
        koreaClock.start();
        usClock.start();

        // 메인 쓰레드 20초 유지
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("메인 쓰레드 종료");
    }
}
