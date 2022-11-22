/**
* https://www.geeksforgeeks.org/chain-responsibility-design-pattern/
* 
* Exemplo do padrão de projeto Chain of Responsibility
*
*/

package chain_of_responsibility.java.exemplo_numeros;

import chain_of_responsibility.java.exemplo_numeros.modelo.Corrente;
import chain_of_responsibility.java.exemplo_numeros.modelo.Numero;

public class Cliente {
  public static void  main(String [] args) {
    
    Corrente corrente = new Corrente();

    corrente.processar(new Numero(33));
    corrente.processar(new Numero(0));
    corrente.processar(new Numero(-55));
    corrente.processar(new Numero(70));
  
  }
  
}
