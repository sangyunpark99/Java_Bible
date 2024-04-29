package com.example.javabible.ch12.ch12_지네릭스.FruitBoxEx3;

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

interface Eatable {}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Object> box) { // <Fruit>로 지정
        String tmp = "";
        for(Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(appleBox).toString());
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