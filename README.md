# java-proxy-bridge-lab
Lab work
Part 1: Proxy Pattern(Questions 01-07)

Q1)Open Loaded Open
Q2)if (realImage == null) realImage = new RealImage();
Q3)[B]Delay creating a heavy object until needed
Q4)ProxyReady
Q5)Printing: Lab_Report.pdf


Part 1 Continued: Proxy Pattern(Questions 08-15)
Q8)START-TASK -END
Q9)System.out.println("Saving file...");
Q10)SLOW_CALC FROM_CACHE
Q11)Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Q11.RealWorker.dowork()" because "this.real" is null
        at Q11.BuggyProxy.run(Main.java:13)
        at Q11.Main.main(Main.java:20)
Q12)if (real == null) real = new RealWorker();