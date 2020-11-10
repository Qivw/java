package com.qi.polymorphic;

/**
 * 多态的三个前提条件
 * 1.子父类继承
 * 2.方法重写
 * 3.父类引用指向子类对象
 */
public class PolymorphicDemo {

    public static void main(String[] args) {
        //3.父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}