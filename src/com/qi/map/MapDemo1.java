package com.qi.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {

    public static void main(String[] args) {

        //定义map集合
        Map<String,String> map = new HashMap<String,String>();

        //添加映射关系
        String zhangssan = map.put("zhangsan", "23");
        map.put("lisi","25");
        map.put("wangwu","22");

        System.out.println(zhangssan);
        System.out.println(map.put("lisi","25"));
        System.out.println(map);

        //集合的长度（个数）
        System.out.println(map.size());

        //是否存在Key
        System.out.println(map.containsKey("zhangsan"));
        System.out.println(map.containsKey("zhaoliu"));

        //是否存在value
        System.out.println(map.containsValue("22"));

        //得到所有key
        Set<String> sets = map.keySet();
        System.out.println(sets);

        //得到所有value
        Collection<String> values = map.values();
        System.out.println(values);

        //删除元素
        String zs = map.remove("zhangsan");
        System.out.println(zs);

        //清空集合
        map.clear();
        System.out.println(map);

    }
}
