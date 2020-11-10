package com.qi;

import java.util.Scanner;

/**
 * 输入字符串，然后字符串反转
 * A:String字符串转化为反向遍历，然后输出
 * B:先将字符串转化为字符数组，进行反转，再将字符数组转化为字符串，最后输出
 * C:利用StringBudiler.reverse()进行反转
 */
public class Reverse {

    public static void main(String[] args) {

        //输入字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = scanner.nextLine();

        //字符串反转
        String string = reverse(s);
        System.out.println("反转之后为：" + string);
    }

    /**
     * 字符串反转方法
     * 返回值：String
     * 形式参数：String
     */
    /*public static String reverse (String s){
        String ss = "";
        //A:String字符串转化为反向遍历，然后输出
        for(int i = s.length()-1; i>=0; i--){
            ss += s.charAt(i);
        }
        return ss;
    }*/

    /*public static String reverse (String s){
        //B:先将字符串转化为字符数组，进行反转，再将字符数组转化为字符串，最后输出
        char[] ch = s.toCharArray();
        for(int start = 0, end = ch.length-1; start<=end; start++, end--){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
        }
        String ss = new String (ch);
        return ss;
    }*/

    /**
     * C:利用StringBudiler.reverse()进行反转
     * @param s
     * @return
     */
    public static String reverse (String s){
        StringBuilder bf = new StringBuilder();
        bf.append(s);
        bf.reverse();
        String result = bf.toString(); // 转化成string类型
        return result;
    }
}
