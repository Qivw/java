package com.qi.socket;

import java.io.IOException;
import java.net.*;

/**
 * 通过UDP协议发送数据
 * */
public class SocketUDP1 {

    public static void main(String[] args) throws IOException {

        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();

        //创建数据并打包
        String shuJu = "Hello socket";  //数据源
        byte[] bytes = shuJu.getBytes();    //转换成字节数组
        int length = bytes.length;    //数据源长度
        InetAddress address = InetAddress.getByName("QivWin");  //要发送给的ip地址
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);

        //发送数据
        ds.send(dp);

        //释放资源
        ds.close();
    }
}
