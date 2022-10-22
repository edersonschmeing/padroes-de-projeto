package builder.java.exemplo_carro.carros;

import builder.java.exemplo_carro.componentes.ComputadorDeBordo;
import builder.java.exemplo_carro.componentes.Motor;
import builder.java.exemplo_carro.componentes.NavegadorGPS;
import builder.java.exemplo_carro.componentes.Transmissao;

public class Carro {
    
    private final TipoDoCarro tipoDoCarro;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorDeBordo computadorDeBordo;
    private final NavegadorGPS navegadorGPS;
    private double combustivel = 0;

    public Carro(TipoDoCarro tipoDoCarro, int assentos, Motor motor, Transmissao transmissao,
               ComputadorDeBordo computadorDeBordo, NavegadorGPS navegadorGPS) {
        
        this.tipoDoCarro = tipoDoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorDeBordo = computadorDeBordo;
        if (this.computadorDeBordo != null) {
            this.computadorDeBordo.setCarro(this);
        }
        this.navegadorGPS = navegadorGPS;
    }

    public TipoDoCarro getTipoDoCarro() {
        return tipoDoCarro;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public int getAssentos() {
        return assentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public ComputadorDeBordo getComputadorDeBordo() {
        return computadorDeBordo;
    }

    public NavegadorGPS getNavegadorGPS() {
        return navegadorGPS;
    }
}
