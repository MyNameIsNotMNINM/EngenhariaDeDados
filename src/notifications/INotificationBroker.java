import java.util.ArrayList;
import java.util.List;

interface INotificationBroker {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

