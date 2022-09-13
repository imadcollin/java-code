package feature;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sockets {
    public static void main(String[] args) {

        String s = getStringIdent("test\ntest1\ntest2\ntest3");
        System.out.println(s);
        System.out.println(tranformString(s));
    }

    public static String getStringIdent(String str) {
        return str.indent(4);
    }

    public static String tranformString(String str) {
        return str.transform(String::toUpperCase);
    }

    public static void getSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(8000);
            boolean running = true;
            while (running) {
                System.out.println("Running.... ");
                Socket sockets = serverSocket.accept();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
