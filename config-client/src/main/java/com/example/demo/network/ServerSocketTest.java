package com.example.demo.network;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * create by yongli on 2020-03-06 22:31
 * 有关于Serverd的操作
 * <p>
 * org.apache.catalina.Service， org.apache.catalina.Server，
 * 可以窥见tomcat的一些构造方式
 * socket设计很多native method，这些非常难，只能去抽象理解
 */
public class ServerSocketTest {

    public void run() {
        try {
            // 服务端监听端口
            ServerSocket serverSocket = new ServerSocket(8081);
            // 阻塞式获取以socket
            Socket socket =serverSocket.accept(); // jdk自带的网络服务的抽象，非常的强大。
            // 获取socket的输入流
            InputStream is = socket.getInputStream();
            byte[] bytes =new byte[1024];
            while (is.read(bytes) >0){
                System.out.println(new String(bytes));
            }
            is.close();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write("I am server, I have read the request");
            // 善后工作
            printWriter.flush();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
