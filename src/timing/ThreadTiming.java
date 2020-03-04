package timing;

import pinger.Ping;

import java.io.IOException;

public class ThreadTiming implements Runnable{
    @Override
    public void run() {
        while(true){
            try {
                Ping.sendPingRequest();
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
