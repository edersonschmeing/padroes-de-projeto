package prototype.java.exemplo_formas;

import prototype.java.exemplo_formas.modelo.Circulo;
import prototype.java.exemplo_formas.modelo.Retangulo;

public class Cliente {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.radius = 15;
        circulo.cor = "red";
       
        Circulo outroCirculo = (Circulo) circulo.clone();

        System.out.println(circulo.toString());
        System.out.println(outroCirculo.toString());

        Retangulo retangulo = new Retangulo();
        retangulo.largura = 10;
        retangulo.altura = 20;
        retangulo.cor = "blue";
        
        Retangulo outroRetangulo = (Retangulo) retangulo.clone();

        System.out.println(retangulo.toString());
        System.out.println(outroRetangulo.toString());
        
    }
}