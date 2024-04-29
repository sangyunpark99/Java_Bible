package com.example.javabible.ch12.ch12_지네릭스.FruitBoxEx2;

import java.util.ArrayList;

interface Eatable {}

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

class Fruit implements Eatable {
    public String toString(){
        return "Fruit";
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

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


public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
        //FruitBox<Grape> grapeBox2 = new FruitBox<Apple>(); 에러, 타입 불일치
        // FruitBox<Toy> toyBox = new FruitBox<Toy>(); 에러 - 제너릭 제한

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        //appleBox.add(new Grape()); - 에러, 타입 불일치
        grapeBox.add(new Grape());

        System.out.println("fruit-Box" + fruitBox);
        System.out.println("apple-Box" + appleBox);
        System.out.println("grapeBox" + grapeBox);
    }
}


