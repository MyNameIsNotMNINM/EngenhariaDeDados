// Concrete observer class
class BookReservedObserver implements IObserver {
    private User user;

    public ConcreteObserver(User user) {
        this.user = user;
    }

    @Override
    public void update(int bookID) {
        user.setNumeroDeNotificacoes(user.getNumeroDeNotificacoes + 1);
    }
}
