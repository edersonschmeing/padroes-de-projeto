package adapter.java.exemplo_burraco_redondo;

import adapter.java.exemplo_burraco_redondo.adapters.PinoQuadradoAdapter;
import adapter.java.exemplo_burraco_redondo.modelo.BurracoRedondo;
import adapter.java.exemplo_burraco_redondo.modelo.PinoQuadrado;
import adapter.java.exemplo_burraco_redondo.modelo.PinoRedondo;

public class Cliente {
    


    public static void main(String[] args) {
        
        BurracoRedondo burraco = new BurracoRedondo(5);
        
        PinoRedondo pinoRedondo = new PinoRedondo(5);
        if (burraco.colocar(pinoRedondo)) {
            System.out.println("O pino redondo com raio 5 se encaixa no burraco redondo com raio 5");
        }

        PinoQuadrado pinoQuadradoPequeno = new PinoQuadrado(2);
        PinoQuadrado pinoQuadradoGrande  = new PinoQuadrado(20);
        
        PinoQuadradoAdapter pinoQuadradoPequenoAdapter = new PinoQuadradoAdapter(pinoQuadradoPequeno);
        PinoQuadradoAdapter pinoQuadradoGrandeAdapter = new PinoQuadradoAdapter(pinoQuadradoGrande);
       
        if (burraco.colocar(pinoQuadradoPequenoAdapter)) {
            System.out.println("O pino quadrado de largura 2 se encaixa em um burraco redondo de raio 5.");
        }
        if (!burraco.colocar(pinoQuadradoGrandeAdapter)) {
            System.out.println("O pino quadrado de largura 20 não se encaixa em um burraco redondo de raio 5.");
        }
    }
}
