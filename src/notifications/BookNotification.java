class BookNotification implements INotificationBroker {
    private int notificationCount;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(notificationCount);
        }
    }

    public void setState(int notificationCount) {
        this.notificationCount = notificationCount;
        notifyObservers();
    }
}
