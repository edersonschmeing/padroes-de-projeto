/**
* https://pt.wikipedia.org/wiki/Decorator 
* 
* Exemplo do padrão de projeto Decorator
*
*/

package decorator.java.exemplo_arma;

import decorator.java.exemplo_arma.decorators.Mira;
import decorator.java.exemplo_arma.decorators.Silenciador;
import decorator.java.exemplo_arma.modelo.Arma;
import decorator.java.exemplo_arma.modelo.ArmaBase;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("### Monta uma arma com mira e silenciador ###");
        Arma armaCompleta = new Silenciador( new Mira( new ArmaBase() ) );
        armaCompleta.montar();
        System.out.println("");
    

        System.out.println("### Monta uma arma sem acessórios ###");
        Arma armaBasica = new ArmaBase();
        armaBasica.montar();
        System.out.println("");
    
        
        System.out.println("### Monta uma arma com silenciador ###");
        Arma armaComSilenciador = new Silenciador( armaBasica );
        armaComSilenciador.montar();
        System.out.println("");


        System.out.println("### Monta uma arma com mira ###");
        Arma armaComMira = new Mira( armaBasica );
        armaComMira.montar();
        System.out.println("");

    }
    
}
