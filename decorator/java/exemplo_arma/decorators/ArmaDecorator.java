package decorator.java.exemplo_arma.decorators;

import decorator.java.exemplo_arma.modelo.Arma;

public class ArmaDecorator implements Arma {
    
   public Arma arma;

  public ArmaDecorator(Arma arma){
    this.arma = arma;
  }

  public void montar(){
     this.arma.montar();
  }


}
