public class PrinterManager {
    // Private static variable of the single instance
    private static PrinterManager instance;

    // Private constructor to prevent instantiation from outside
    private PrinterManager() {
        // initialization code
    }

    // Public method to provide access to the single instance
    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}

// Test class
public class SingletonExample {
    public static void main(String[] args) {
        PrinterManager printer1 = PrinterManager.getInstance();
        PrinterManager printer2 = PrinterManager.getInstance();

        printer1.print("Document1.pdf");

        if (printer1 == printer2) {
            System.out.println("Both are the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
