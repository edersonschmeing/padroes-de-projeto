package decorator.java.exemplo_arma.decorators;

import decorator.java.exemplo_arma.modelo.Arma;

public class Mira extends ArmaDecorator {

    public Mira(Arma arma){
        super(arma);
      }
    
    @Override
    public void montar(){
        super.montar();
        System.out.println("Adicionando mira a arma");
    }
    
}
