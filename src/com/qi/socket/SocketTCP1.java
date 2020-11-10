package com.qi.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP协议发送数据
 */
public class SocketTCP1 {

    public static void main(String[] args) throws IOException {

        //创建TCP发送数据对象
        Socket socket = new Socket("QivWin", 10086);

        //要发送的数据
        String str = "hello,i'm TCP!";

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(str.getBytes());

        //关闭
        socket.close();
    }
}
