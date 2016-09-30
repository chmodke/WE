package study.baodian.basic.pkg4_7_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by kehao on 2016/9/30 18:28.
 * Description：
 */
public class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            Socket socket =new Socket("localhost",10086);
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw=new PrintWriter(socket.getOutputStream(),true);
            pw.println("Hello");
            String s=null;
            while (true){
                s=br.readLine();
                if (s!=null){
                    break;
                }
            }
            System.out.println(s);
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
