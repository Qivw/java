package com.qi.arry;

import java.util.ArrayList;
import java.util.List;

public class Arrylist {

    public static void main(String[] args){
        //定义一个字符串数组
        String[] strArray = {"宋远桥","张翠山","张无忌","张敏","周芷若"};

        //定义一个集合
        List arrylist = new ArrayList();

        //将字符串数组放到集合中
        for(int i = 0 ; i<strArray.length; i++){
            arrylist.add(strArray[i]);

        }

        //遍历输出姓张的
        for(int i = 0 ; i<arrylist.size(); i++){
            String s = (String) arrylist.get(i);
            if(s.startsWith("张")){
                System.out.println(s);
            }
        }
    }
}
