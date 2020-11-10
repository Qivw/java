package com.qi.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输入输出流拷贝图片
 * 字节流可以拷贝任何东西，字符流不可以拷贝二进制的东西（用记事本打开时乱码的）
 */
public class ByteIo {
    public static void main(String[] args) throws IOException {

        //创建字节输入流对象
        FileInputStream fi = new FileInputStream("第三方无线-无线优化-通用-L1-201907-A场(第三方无线-无线优化-通用-L1).png");
        //创建字节输出流对象
        FileOutputStream fo = new FileOutputStream("E:\\第三方无线-无线优化-通用-L1-201907-A场(第三方无线-无线优化-通用-L1).png");

        /*//一次读一个字节
        int i = 0;
        while((i = fi.read()) != -1) {
            fo.write(i);
        }*/

        //一次读一个字节数组
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fi.read(bytes)) != -1) {
            fo.write(bytes,0,len);
        }

        //关闭流
        fo.close();
        fi.close();
    }
}
