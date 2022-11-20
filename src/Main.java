
import  java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args){
        InetAddress ip = null;

        try {
            ip = InetAddress.getByName("www.youtube.com");
            System.out.println("YouTube : " + ip.getHostName());
            System.out.println("Address: "+ ip.getHostAddress());
            System.out.println("My :" + InetAddress.getLocalHost());
            
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
