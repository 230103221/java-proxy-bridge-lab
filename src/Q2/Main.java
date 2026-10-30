package Q2;

class RealImage {
    void show() { System.out.println("Displaying image"); }
}

class ImageProxy {
    RealImage realImage;
    void show() {
        if (realImage == null) realImage = new RealImage();
        realImage.show();
    }
}

public class Main {
    public static void main(String[] args) {
        ImageProxy proxy = new ImageProxy();
        proxy.show();
    }
}