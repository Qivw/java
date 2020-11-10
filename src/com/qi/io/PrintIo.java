package com.qi.io;

import java.io.*;

/**
 * 打印流拷贝文件
 */
public class PrintIo {

    public static void main(String[] args) throws IOException {

        //创建输入流对象
        BufferedReader br = new BufferedReader(new FileReader("CopyFile.java"));
        //创建打印流对象
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\CopyFile.java"),true);
        String line;
        while((line = br.readLine()) != null) {
            pw.println(line);
        }

        //关闭流
        pw.close();
        br.close();
    }
}
