package com.qi.overload_overwrite;

/**
 * 重载
 * 方法重载是让类以统一的方式处理不同类型数据的一种手段
 * 多个同名函数同时存在，具有不同的参数个数/类型。
 * 重载的时候，方法名要一样，但是参数类型和个数不一样，返回值类型可以相同也可以不相同。
 * 无法以返回型别作为重载函数的区分标准。
 */
public class OverLoad {
    private int sum;
    private String str;

    public void get(){

    }

    public void get(int sum){}

    public String get(String str){
        return str;
    }

    public OverLoad() {
    }

    public OverLoad(int sum, String str) {
        this.sum = sum;
        this.str = str;
    }
}

class test{
    public static void main(String args[]){
        String str = "opp";
        OverLoad overLoad = new OverLoad();
        String s = overLoad.get(str);
        System.out.println(s);
    }
}
