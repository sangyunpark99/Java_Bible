package com.example.javabible.ch12_enum.EnumEx3;

enum Transportation {
    BUS(100) {
        int fare(int distance) { return distance * BASIC_FARE;}
    },
    TRAIN(150) {
        int fare(int distance) { return distance * BASIC_FARE;}
    },
    SHIP(100) {
        int fare(int distance) { return distance * BASIC_FARE;}
    },
    AIRPLANE(300) {
        int fare(int distance) { return distance * BASIC_FARE;}
    };

    abstract int fare(int distance); // 거리에 따른 요금을 계산하는 추상 메서드
    protected final int BASIC_FARE; // protected로 해야 각 상수에서 접근 가능

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBasicFare(){
        return BASIC_FARE;
    }
}

public class EnumEx3 {
    public static void main(String[] args) {
        System.out.println("bus fare = " + Transportation.BUS.fare(100));
        System.out.println("train fare = " + Transportation.TRAIN.fare(100));
        System.out.println("ship fare = " + Transportation.SHIP.fare(100));
        System.out.println("airplane fare = " + Transportation.AIRPLANE.fare(100));

    }
}
