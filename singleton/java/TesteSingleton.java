package singleton.java;

public class TesteSingleton {
 
    public static void main(String[] args) {


        Singleton singleton = Singleton.getInstance("singleton");
        Singleton segundoSingleton = Singleton.getInstance("segundo Singleton");
        Singleton terceiroSingleton = Singleton.getInstance("terceiro Singleton");
        
       
        System.out.println("");
        System.out.println("Nome das instância criadas");
        System.out.println(singleton.valor);
        System.out.println(segundoSingleton.valor);
        System.out.println(terceiroSingleton.valor);


        System.out.println("");
        System.out.println("Idenficação o objeto");
        System.out.println(singleton.toString());
        System.out.println(segundoSingleton.toString());
        System.out.println(terceiroSingleton.toString());
       

    }

}