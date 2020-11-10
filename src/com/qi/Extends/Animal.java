package com.qi.Extends;


/**
 * 子类调用构造方法，会默认先调用父类的无参构造方法，在调用子类的构造方法
 * 如果第一行指定调用构造方法，那么先调用父类的无参构造，再依次执行
 * 肯定默认调用父类的无参构造。
 */
public class Animal {

    public Animal() {

        System.out.println("fu类的无参构造");
    }

    public Animal(int tui) {
        System.out.println("fu类的有参构造");
    }
}

class Cat extends Animal {

    public Cat() {
        this(2);
        System.out.println("zi类的无参构造");
    }

    public Cat(int tui) {
        System.out.println("zi类的有参构造");
    }
}


class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        System.out.println(cat1);

    }
}