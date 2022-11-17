/**
* Interface Observer (também faz parte da implementação interna do padrão)
* Todo observador deve implementar essa interface
*/


package observer.java.exemplo_temperatura.modelo;

public interface Observer {

    public void update(Subject s);

  }