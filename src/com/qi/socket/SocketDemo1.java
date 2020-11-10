package com.qi.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SocketDemo1 {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress ia = InetAddress.getByName("QivWin");
        String hostAddress = ia.getHostAddress();
        String hostName = ia.getHostName();
        System.out.println(ia);
        System.out.println(hostAddress);
        System.out.println(hostName);
    }
}
