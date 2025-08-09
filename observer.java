import java.util.ArrayList;
import java.util.List;

// Subject interface
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}

// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Subject
class Channel implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void uploadVideo(String title) {
        System.out.println("Channel uploaded: " + title);
        notifyObservers(title);
    }
}

// Concrete Observer
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

// Test class
public class LooselyCoupledExample {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");

        channel.addObserver(s1);
        channel.addObserver(s2);

        channel.uploadVideo("Observer Pattern Explained");
    }
}
