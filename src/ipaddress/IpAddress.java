package ipaddress;

import mailer.Mailer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class IpAddress {
    private static String ip = "1";
    private static String secondIp = "2";

    public static void getIpAddress() throws IOException {
        if(ip.equals(secondIp)){
            System.out.println("Host is reachable.");
            URL ipAddress = new URL("http://ifconfig.me/ip");
            BufferedReader in = new BufferedReader(new InputStreamReader(ipAddress.openStream()));
            ip = in.readLine(); //you get the IP as a String
        }else{
            URL ipAddress = new URL("http://ifconfig.me/ip");
            BufferedReader in = new BufferedReader(new InputStreamReader(ipAddress.openStream()));
            ip = in.readLine(); //you get the IP as a String
            Mailer.sendMail(ip);
            secondIp = ip;
            System.out.println(secondIp);
        }
    }
}
