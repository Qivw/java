package com.qi.Final;


/**
 * final修饰变量
 */
public class Test {
    private int sum;
    private String name;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test(int sum, String name) {
        this.sum = sum;
        this.name = name;
    }

    public Test() {
    }
}

class MainTest{
    public static void main(String args[]){

        Test test = new Test(12,"xiaoming");
        final int a = 12;
        //a = 13;
    }
}