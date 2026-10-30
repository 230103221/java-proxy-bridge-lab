package Q12;

class RealWorker {
    void dowork() {
        System.out.print("WorkDone ");
    }
}

class FixedProxy {
    RealWorker real;

    void run() {
        // here
        if (real == null) {
            real = new RealWorker();
        }
        real.dowork();
    }
}

public class Main {
    public static void main(String[] args) {
        FixedProxy proxy = new FixedProxy();
        proxy.run();
    }
}