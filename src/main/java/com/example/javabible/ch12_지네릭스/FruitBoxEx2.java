package com.example.javabible.ch12_지네릭스;

interface Eatable {}

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


