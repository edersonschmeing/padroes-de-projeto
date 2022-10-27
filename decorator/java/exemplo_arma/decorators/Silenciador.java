package decorator.java.exemplo_arma.decorators;

import decorator.java.exemplo_arma.modelo.Arma;

public class Silenciador extends ArmaDecorator {

    public Silenciador(Arma arma){
        super(arma);
      }
    
      @Override
      public void montar(){
        super.montar();
        System.out.println("Adicionando silenciador a arma");
      }
    
}
