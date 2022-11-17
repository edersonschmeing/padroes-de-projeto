/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Strategy
*
*/

package observer.java.exemplo_temperatura;

import observer.java.exemplo_temperatura.modelo.Temperatura;
import observer.java.exemplo_temperatura.modelo.TermometroCelsius;
import observer.java.exemplo_temperatura.modelo.TermometroFahrenheit;

public class Cliente {
  public static void  main(String [] args) {
    
    Temperatura t = new Temperatura();
    t.addObserver(new TermometroCelsius());
    t.addObserver(new TermometroFahrenheit());

    t.setTemp(100.0); // muda temperatura; logo, observadores são notificados

  }
  
}
