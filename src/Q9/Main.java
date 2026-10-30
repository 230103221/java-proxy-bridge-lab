package Q9;

class RealStorage {
    void save(String name) {
        System.out.println("File " + name + " saved.");
    }
}

class StorageProxy {
    RealStorage realStorage = new RealStorage();

    void save(String name) {
        System.out.println("Saving file...");
        realStorage.save(name);
    }
}

public class Main {
    public static void main(String[] args) {
        StorageProxy proxy = new StorageProxy();
        proxy.save("data.txt");
    }
}