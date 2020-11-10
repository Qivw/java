package com.qi.file;

import java.io.File;


public class FileDemo {
    public static void main(String[] args) {

        //新建file对象，指向一个目录
        File file = new File("E:\\WorkSpaces\\java\\src\\com\\qi");

        //method(file);

        method1(file);
    }


    /**
     * 输出指定目录下所有的java文件
     */
    public static void method(File file) {
        //判断file对象是否是一个目录
        if(file.isDirectory()) {
            //拿到此路径下的所有文件名
            String[] files = file.list();
            //遍历所有文件找到java文件
            for(String f : files) {
                if(f.endsWith(".java")) {
                    System.out.println(f);
                }
            }
        }
    }

    /**
     * 输出指定目录下以及子目录下所有的java文件
     */
    public static void method1(File file) {
        //判断file对象是否是一个目录
        if(file.isDirectory()) {
            //拿到此路径下的所有文件名
            File[] files = file.listFiles();
            //遍历
            for(File f : files) {
                //判断是否是一个文件
                if(f.isFile()) {
                    //判断是否为一个java文件
                    if(f.getName().endsWith(".java")) {
                        System.out.println(f.getName());
                    }
                }else {
                    method1(f);
                }
            }
        }
    }
}
