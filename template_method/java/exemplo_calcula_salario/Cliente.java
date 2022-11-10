package template_method.java.exemplo_calcula_salario;

import template_method.java.exemplo_calcula_salario.modelo.regimeCLT;

public class Cliente {

    public static void main(String[] args) {   
       
        regimeCLT func_regimeCLT = new regimeCLT(1000);
        double salario = func_regimeCLT.calculaSalarioLiquido();
        System.out.println("Salário Líquido: " + salario);  
      
    }
    
}