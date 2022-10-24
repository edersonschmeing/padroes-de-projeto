package adapter.java.exemplo_burraco_redondo.adapter;

import adapter.java.exemplo_burraco_redondo.modelo.PinoQuadrado;
import adapter.java.exemplo_burraco_redondo.modelo.PinoRedondo;

public class PinoQuadradoAdapter extends PinoRedondo {
    
    private PinoQuadrado pino;

    public PinoQuadradoAdapter(PinoQuadrado pino) {
        this.pino = pino;
    }

    @Override
    public double getRaio() {
        double resultado;
        resultado = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return resultado;
    }
}