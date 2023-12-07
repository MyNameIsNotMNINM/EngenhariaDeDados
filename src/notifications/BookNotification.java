class BookNotification implements INotificationBroker {
    private int bookID;
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
            observer.update(bookID);
        }
    }

    public void setState(int bookID) {
        this.bookID = bookID;
        notifyObservers();
    }
}
