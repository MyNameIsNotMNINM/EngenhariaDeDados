package interfaces;

public interface INotificacao {
    public void registrarObservador(Observer observador);
    public void removerObservador(Observer observador);
    public void notificarObservadores();
}