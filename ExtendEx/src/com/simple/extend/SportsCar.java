package com.simple.extend;

public class SportsCar extends Car {

   private  boolean turbo;

    public SportsCar(String brand, int wheelCount) {
        super(brand, wheelCount);
        System.out.println("스포츠 카 생성됨");
    }

    public void pushTurbo(){
        turbo = true;
        System.out.println(brand+"터보 모드 작동 중"+wheelCount);
    }
}
