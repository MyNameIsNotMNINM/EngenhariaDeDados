package interfaces;

public interface INotificacao {
    void registrarObservador(Observer observador);
    void removerObservador(Observer observador);
    void notificarObservadores();
}