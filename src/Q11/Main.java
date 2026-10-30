package Q11;

class RealWorker {
    void dowork() {
        System.out.println("....");
    }
}

class BuggyProxy {
    RealWorker real;

    void run() {
        real.dowork(); 
    }
}

public class Main {
    public static void main(String[] args) {
        BuggyProxy proxy = new BuggyProxy();
        proxy.run();
    }
}