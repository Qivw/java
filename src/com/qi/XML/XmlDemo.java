package com.qi.XML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileReader;
import java.util.List;

public class XmlDemo {

    public static void main(String[] args) {
        try {
            //创建sax读取对象
            SAXReader saxReader = new SAXReader();

            //指定解析的xml源
            Document document = saxReader.read(new FileReader("E:\\WorkSpaces\\java\\src\\firstXml.xml"));

            //得到根元素
            Element rootElement = document.getRootElement();

            //获取根元素下面得元素
            //String text = rootElement.element("category").element("cname").getText();
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                String cid = element.element("cid").getText();
                String cname = element.element("cname").getText();
                String desc = element.element("desc").getText();
                System.out.println("cid="+cid+"---cname="+cname+"---desc="+desc);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
