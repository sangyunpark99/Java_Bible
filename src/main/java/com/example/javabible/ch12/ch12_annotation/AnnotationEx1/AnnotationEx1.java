package com.example.javabible.ch12.ch12_annotation.AnnotationEx1;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    void parentMethod() {}
}

public class AnnotationEx1 {
}
