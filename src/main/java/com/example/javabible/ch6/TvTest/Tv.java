package com.example.javabible.ch6.TvTest;

public class Tv {
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }

    void channelUp(){
        ++channel;
    }

    void channelDown(){
        --channel;
    }
}
