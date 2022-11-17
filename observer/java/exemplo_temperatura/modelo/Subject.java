/**
* Classe Subject (que faz parte da implementação interna do padrão)
* Todo sujeito deve herdar dessa classe
* Ela inclui métodos para adicionar, remover e notificar os
* observadores desse sujeito
*
*/


package observer.java.exemplo_temperatura.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Subject {

  private List<Observer> observers = new ArrayList<Observer>();
  
  public void addObserver(Observer observer) {
  
    observers.add(observer);
  
  }
  
  public void removeObserver(Observer observer) {
  
    observers.remove(observer);
  
  }
  
  public void notifyObservers() {
  
    Iterator<Observer> it = observers.iterator();
    while (it.hasNext()) {
      Observer obs= it.next();
      obs.update(this);     
    }
  }
    
}
