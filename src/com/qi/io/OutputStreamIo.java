package com.qi.io;

import java.io.*;

/**
 * 标准输出流将文件内容打印到控制台
 */
public class OutputStreamIo {

    public static void main(String[] args) throws IOException {
        //method1();
        //method2();
        method3();

    }

    private static void method3() throws IOException {
        //创建字符输入流
        BufferedReader br = new BufferedReader(new FileReader("CopyFile.java"));
        //创建标准字节输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //定义
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        //关闭流
        bw.close();
        br.close();
    }


    private static void method2() throws IOException {
        //创建字符输入流
        BufferedReader br = new BufferedReader(new FileReader("CopyFile.java"));
        //创建标准字节输出流
        Writer w = new BufferedWriter(new OutputStreamWriter(System.out));
        //定义
        String line = null;
        while ((line = br.readLine()) != null) {
            w.write(line);
            w.write("\r\n");
        }

        //关闭流
        w.close();
        br.close();
    }


    private static void method1() throws IOException {
        //创建字符输入流
        BufferedReader br = new BufferedReader(new FileReader("CopyFile.java"));
        //创建标准字节输出流
        OutputStream os = System.out;
        //定义
        String line = null;
        while ((line = br.readLine()) != null) {
            os.write(line.getBytes());
            os.write("\r\n".getBytes());
        }

        //关闭流
        os.close();
        br.close();
    }
}
