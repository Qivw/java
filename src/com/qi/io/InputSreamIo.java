package com.qi.io;

import java.io.*;

/**
 * 标准输入流将将内容输入到文本中
 */
public class InputSreamIo {

    public static void main(String[] args) throws IOException {
        method1();


        //创建标准输入流
        Reader r = new InputStreamReader(System.in);
        //创建输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        //定义
        int len;
        char[] chars = new char[1024];
        while((len = r.read(chars)) != -1) {
            bw.write(chars,0,len);
            bw.flush();
        }

        //关闭流
        bw.close();
        r.close();
    }

    private static void method1() throws IOException {
        //创建标准输入流
        InputStream is = System.in;
        //创建输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        //定义
        int len;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes)) != -1) {
            bw.write(new String(bytes),0,len);
            bw.flush();
        }

        //关闭流
        bw.close();
        is.close();
    }
}
