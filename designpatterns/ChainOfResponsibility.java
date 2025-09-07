// Abstract Handler
abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}

// Concrete Handlers
class ConsoleLogger extends Handler {
    public void handleRequest(String request) {
        if (request.equals("console")) {
            System.out.println("Handled by ConsoleLogger");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

class FileLogger extends Handler {
    public void handleRequest(String request) {
        if (request.equals("file")) {
            System.out.println("Handled by FileLogger");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

class DatabaseLogger extends Handler {
    public void handleRequest(String request) {
        if (request.equals("db")) {
            System.out.println("Handled by DatabaseLogger");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        Handler console = new ConsoleLogger();
        Handler file = new FileLogger();
        Handler db = new DatabaseLogger();

        // Build the chain
        console.setNext(file);
        file.setNext(db);

        // Test requests
        console.handleRequest("console");  // Handled by ConsoleLogger
        console.handleRequest("file");     // Handled by FileLogger
        console.handleRequest("db");       // Handled by DatabaseLogger
        console.handleRequest("network");  // Unhandled
    }
}
