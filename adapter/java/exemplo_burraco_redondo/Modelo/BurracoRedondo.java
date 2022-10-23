package adapter.java.exemplo_burraco_redondo.Modelo;

public class BurracoRedondo {
    
    private double raio;

    public BurracoRedondo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public boolean colocar(PinoRedondo pino) {
        boolean resultado;
        resultado = (this.getRaio() >= pino.getRaio());
        return resultado;
    }

}
