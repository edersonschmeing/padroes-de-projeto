package singleton.java;

public final class Singleton {
    
    private static Singleton instancia = null;
    
    public String valor;

    private Singleton(String valor) {
        this.valor = valor;
    }

    public static Singleton getInstance(String value) {
        if (instancia == null) {
            instancia = new Singleton(value);
        }
        return instancia;
    }
}


