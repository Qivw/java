package com.qi.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 拷贝一个文件
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {

        //创建IO对象
        FileReader fr = new FileReader("b.txt");

        FileWriter fw = new FileWriter("copy.txt");

        //先将b.txt 文件输入到内存中，再将内存中的数据输出到copy.txt
        int ch ;
        while((ch = fr.read()) != -1){
            fw.write(ch);   //以字符的形式读，也要以字符的形式接收
        }

        fr.close();
        fw.close();
    }
}
