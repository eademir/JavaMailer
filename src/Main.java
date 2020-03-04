import timing.ThreadTiming;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTiming());
        t.start();
    }
}
