package pinger;

import ipaddress.IpAddress;
import mailer.Mailer;

import java.io.IOException;
import java.net.InetAddress;

public class Ping {
    private static Mailer mail;
    public static void sendPingRequest() throws IOException {
        String ipAddress = "eray.works";
        InetAddress geek = InetAddress.getByName(ipAddress);
        System.out.println("Sending Ping Request to " + ipAddress);
        if ((geek.isReachable(5000))) {
            System.out.println("Host is reachable");
        } else {
            IpAddress.getIpAddress();
        }
    }
}
