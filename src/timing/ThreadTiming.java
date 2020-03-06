package timing;

import ipaddress.IpAddress;

import java.io.IOException;

public class ThreadTiming implements Runnable{
    @Override
    public void run() {
        while(true){
            try {
                IpAddress.getIpAddress();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(600000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
