package com.example.javabible.ch12.ch12_지네릭스.FruitBoxEx1;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString(){
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString(){
        return "Grape";
    }
}

class Toy {
    public String toString(){
        return "Toy";
    }
}

public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<>(); // 타입 생략 가능
        // Box<Grape> grapeBox = new Box<Apple>(); - 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 다형성

        appleBox.add(new Apple());
        //appleBox.add(new Toy()); - Apple만 담을 수 있음

        System.out.println(fruitBox);
        System.out.println(appleBox);
    }
}

class Box<T> {

    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size(){
        return list.size();
    }

    public String toString(){
        return list.toString();
    }
}
