package com.qi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历map集合思路
 * 1.通过keySet()得到所有key
 * 2.遍历所有key
 * 3.通过key得到所对应的value
 */
public class MapDemo2 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("余罪","大胸姐");
        map.put("老傅","沈嘉文");
        map.put("粉仔","小鸡");

        //遍历map集合
        Set<String> sets = map.keySet();
        for (String set : sets) {
            String value = map.get(set);
            System.out.println("男：" + set + "....女：" + value);
        }
    }
}
