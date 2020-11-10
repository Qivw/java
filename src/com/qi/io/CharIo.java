package com.qi.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输入输出流复制文本文件
 */
public class CharIo {

    public static void main(String[] args) throws IOException {

        //创建字符输入流
        FileReader fr = new FileReader("CopyFile.java");
        //创建字符输出流
        FileWriter fw = new FileWriter("E:\\CopyFile.java");

        /*//一次写入一个字符
        int ch;
        while((ch = fr.read()) != -1) {
            fw.write(ch);
            fw.flush();
        }*/

        //一次写入一个字符数组
        int len;
        char[] chars = new char[1024]; //存储的大小一般是1024的整数倍
        while((len = fr.read(chars)) != -1) {
            fw.write(chars,0,len);
            fw.flush();
        }

        //关闭流
        fw.close();
        fr.close();
    }
}
