package ipaddress;

import mailer.Mailer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class IpAddress {
    public static void getIpAddress() throws IOException {
        URL whatismyip = new URL("http://ifconfig.me/ip");
        BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
        String ip = in.readLine(); //you get the IP as a String
        Mailer.sendMail(ip);
    }
}
