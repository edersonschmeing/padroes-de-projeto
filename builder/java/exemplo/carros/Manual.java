package builder.java.exemplo.carros;

import builder.java.exemplo.componentes.ComputadorDeBordo;
import builder.java.exemplo.componentes.Motor;
import builder.java.exemplo.componentes.NavegadorGPS;
import builder.java.exemplo.componentes.Transmissao;

public class Manual {
    
    private final TipoDoCarro tipoDoCarro;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorDeBordo computadorDeBordo;
    private final NavegadorGPS navegadorGPS;
  

    public Manual(TipoDoCarro tipoDoCarro, int assentos, Motor motor, Transmissao transmissao,
               ComputadorDeBordo computadorDeBordo, NavegadorGPS navegadorGPS) {
        
        this.tipoDoCarro = tipoDoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorDeBordo = computadorDeBordo;
        this.navegadorGPS = navegadorGPS;
    }


    public String print() {
        String info = "";
        info += "Tipo do Carro: " + tipoDoCarro + "\n";
        info += "Número de Assentos: " + assentos + "\n";
        info += "Motor: volume - " + motor.getVolume() + "; quilometragem - " + motor.getQuilometragem() + "\n";
        info += "Transmissao: " + transmissao + "\n";
        if (this.computadorDeBordo != null) {
            info += "Computador de Bordo: Functional" + "\n";
        } else {
            info += "Computador de Bordo: Não tem" + "\n";
        }
        if (this.navegadorGPS != null) {
            info += "Navegador GPS: Functional" + "\n";
        } else {
            info += "Navegador GPS: Não tem" + "\n";
        }
        return info;
    }
}