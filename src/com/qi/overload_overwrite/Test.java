package com.qi.overload_overwrite;

public class Test {

    private int sum;
    private String name;

    public Test(){}

    public Test(int sum, String name) {
        this.sum = sum;
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setName(String name) {
        this.name = name;
    }
}