package com.qi.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 通过UDP协议接收数据
 */
public class SocketUDP2 {

    public static void main(String[] args) throws IOException {

        //创建接收数据对象
        DatagramSocket ds = new DatagramSocket(8888);

        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        System.out.println("等待接收数据...");
        ds.receive(dp);
        System.out.println("数据接收完毕！");

        //解析数据
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();

        //输出数据
        System.out.println("对方ip为：" + address);
        System.out.println(new String(data,0,length));

        //关闭流
        ds.close();
    }
}
