package Q5;

class RealPrinter {
    void printDocument(String doc) {
        System.out.println("Printing: " + doc);
    }
}

class PrinterProxy {
    RealPrinter realPrinter = new RealPrinter();

    void printDocument(String doc) {
        realPrinter.printDocument(doc);
    }
}

public class Main {
    public static void main(String[] args) {
        PrinterProxy proxy = new PrinterProxy();
        proxy.printDocument("Lab_Report.pdf");
    }
}