package builder.java.exemplo.builders;

import builder.java.exemplo.carros.Manual;
import builder.java.exemplo.carros.TipoDoCarro;
import builder.java.exemplo.componentes.ComputadorDeBordo;
import builder.java.exemplo.componentes.Motor;
import builder.java.exemplo.componentes.NavegadorGPS;
import builder.java.exemplo.componentes.Transmissao;

public class CarroManualBuilder implements Builder{
   
    private TipoDoCarro tipoDoCarro;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorDeBordo computadorDeBordo;
    private NavegadorGPS navegadorGPS;


    public void setTipoDoCarro(TipoDoCarro tipoDoCarro) {
        this.tipoDoCarro = tipoDoCarro;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Manual getResultado() {
        return new Manual(tipoDoCarro, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
    }
    
}

