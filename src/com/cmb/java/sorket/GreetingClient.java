package com.cmb.java.sorket;

/**
 * Socket Programming Base
 * TCP: 传输控制协议 Transmission Control Protocol
 * 面向连接，可靠的，基于字节流
 * 位于IP层之上，应用层之下的中间层
 * 保障了两个应用程序之间的可靠通信，常用于互联协议，
 * TCP/IP
 *
 * UDP User Datagram Protocol 用户数据包协议
 * 位于OSI模型的传输层，是无连接的协议
 * 无连接协议，提供了应用程序之间要发送数据的数据报，
 * 由于缺乏可靠性且属于无连接协议，所以应用程序通常必须容许丢失、错误或重复的数据包
 */

import java.io.*;
import java.net.Socket;

public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try{
            System.out.println("Connect To Host's Server:"+serverName+",端口："+port);
            Socket client = new Socket(serverName,port);
            System.out.println("Remote Hostname:"+client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello From"+client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server Respon:"+in.readUTF());
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
