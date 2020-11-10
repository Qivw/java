package com.qi.overload_overwrite;

/**
 * 重写
 * 重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。
 * 即外壳不变，核心重写！
 */
public class Overwrite {

    public static void main(String args[]){
        Cat cat1 = new Cat();
        cat1.setName("xiaohu");
        String name = cat1.getName();
        System.out.println(name);
        String hename = cat1.hename(name);
        System.out.println(hename);

        System.out.println("..................................");
        Test uuu = new Test(12, "uuu");
        System.out.println(uuu.getName());




        /*System.out.println("......................................");
        Animal animal = new Cat();
        //animal.hename();
        System.out.println("......................................");
        Cat cat = (Cat) new Animal(17,"xiaohua");
        //String hename1 = cat.hename();
        //System.out.println(hename1);*/

    }
}

class Animal{
    private int age;
    private String name;

    public Animal(){
        System.out.println("Animal的无参构造");
    }

    public Animal(int age,String name){
        System.out.println("Animal的有参构造");
    }

    public String hename(String name){
        return name;
    }

}

class Cat extends Animal{
    private String name;
    private String eat;

    public Cat(){
        System.out.println("Cat的无参构造");
    }

    public Cat(String eat,String name){
        //super();
        System.out.println("Cat的有参构造");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String hename(String name){
        return name;
    }
}
