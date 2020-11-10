package com.qi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 第二种遍历思路
 * 1.先找到一张张“结婚证”
 * 2.通过"结婚证"拿到丈夫，媳妇
 */
public class MapDemo3 {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("唐僧","女儿国国王");
        map.put("张杰","谢娜");
        map.put("陈思诚","佟丽娅");

        //拿到“结婚证”集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        //遍历“结婚证”
        for (Map.Entry<String,String> entry:entries) {
            //通过结婚证拿到”丈夫“
            String key = entry.getKey();
            //通过结婚证拿到“媳妇”
            String value = entry.getValue();

            System.out.println("丈夫：" + key + "...媳妇：" + value);
        }
    }
}
