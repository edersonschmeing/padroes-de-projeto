
/**
* Temperatura são sujeitos (isto é, objetos que podem ser observados)
*/


package observer.java.exemplo_temperatura.modelo;


public class Temperatura extends Subject {

   private double temp;
   
   public double getTemp() {
     return temp;
   }
  
   public void setTemp(double temp) {
     this.temp = temp;
     notifyObservers(); // notifica os meus observadores
   }
    
}
