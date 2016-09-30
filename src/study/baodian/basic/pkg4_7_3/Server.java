package study.baodian.basic.pkg4_7_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by kehao on 2016/9/30 18:28.
 * Description：
 */
public class Server {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            ServerSocket server = new ServerSocket(10086);
            Socket socket=server.accept();
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw=new PrintWriter(socket.getOutputStream(),true);
            String s=br.readLine();
            pw.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
