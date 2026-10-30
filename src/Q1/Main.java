package Q1;
class RealBook { 
    RealBook() { 
        System.out.print("Loaded "); 
    } 
}

class BookProxy {
    RealBook b = null;
    void open() {
        System.out.print("Open ");
        if (b == null) {
            b = new RealBook();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        BookProxy p = new BookProxy();
        p.open();
        p.open();
    }
}