package com.qi.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP协议接收数据
 */
public class SocketTCP2 {

    public static void main(String[] args) throws IOException {

        //创建接收对象
        ServerSocket serverSocket = new ServerSocket(10086);

        //创建监听
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();

        //接收数据
        byte[] bytes = new byte[1024];
        int len;
        while((len = inputStream.read(bytes))!= -1) {
            System.out.println(new String(bytes,0,len));
        }
        //len = inputStream.read(bytes);

        //System.out.println(new String(bytes,0,len));

        //关闭流
        inputStream.close();
    }
}
