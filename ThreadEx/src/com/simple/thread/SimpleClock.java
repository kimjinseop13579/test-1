package com.simple.thread;

import java.nio.channels.ScatteringByteChannel;
import java.time.LocalTime;
import java.util.Locale;

public class SimpleClock {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            LocalTime now = LocalTime.now();
            System.out.println(now);
            // 1초 쉬었다가 출력해
            try {
            Thread.sleep(1000);

            }catch (InterruptedException e ){
                throw new RuntimeException(e);
            }
        }



    }
}
