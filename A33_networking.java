import java.net.InetAddress;

public class A33_networking {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("wwww.google.com");
            System.out.println("Host = "+ip.getHostName());
            System.out.println("Ip address = "+ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
