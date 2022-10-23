package adapter.java.exemplo_burraco_redondo.Modelo;

public class PinoQuadrado {
  
    private double largura;
    
    public PinoQuadrado(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return largura;
    }

    public double getQuadrado() {
        double resultado;
        resultado = Math.pow(this.largura, 2);
        return resultado;
    }

}
