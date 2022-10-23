package factory_method.java.exemplo_transportes.antes_do_padrao.modelo;

public abstract class Transporte {
        
    public static final int AEREO = 1;
    public static final int FERROVIARIO = 2;
    public static final int HIDROVIARIO = 3;
    public static final int RODOVIARIO = 4; 


    public abstract void entregar();

      
}