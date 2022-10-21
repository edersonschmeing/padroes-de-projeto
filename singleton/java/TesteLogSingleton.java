package singleton.java;

public class TesteLogSingleton {
 
    public static void main(String[] args) {
        
        LogSingleton logSingleton1 = LogSingleton.getInstance();
        System.out.println(logSingleton1.toString());
        logSingleton1.escreve_linha_arquivo("logSingleton1");

        LogSingleton logSingleton2 = LogSingleton.getInstance();
        System.out.println(logSingleton2.toString());
        logSingleton1.escreve_linha_arquivo("logSingleton2");

        LogSingleton logSingleton3 = LogSingleton.getInstance();
        System.out.println(logSingleton3.toString());
        logSingleton1.escreve_linha_arquivo("logSingleton3");

    }

}