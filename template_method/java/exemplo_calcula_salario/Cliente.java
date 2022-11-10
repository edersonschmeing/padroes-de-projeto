package template_method.java.exemplo_calcula_salario;

import template_method.java.exemplo_calcula_salario.modelo.RegimeCLT;
import template_method.java.exemplo_calcula_salario.modelo.RegimeEstatutario;
import template_method.java.exemplo_calcula_salario.template_method.Funcionario;

public class Cliente {

    public static void main(String[] args) {   
       
        Funcionario func_regimeCLT = new RegimeCLT(1000);
        double salario_CLT = func_regimeCLT.calculaSalarioLiquido();
        System.out.println("Salário Líquido CLT: " + salario_CLT);  

        
        Funcionario func_regimeEstatutario = new RegimeEstatutario(1000);
        double salario_estatutario = func_regimeEstatutario.calculaSalarioLiquido();
        System.out.println("Salário Líquido Estatutário: " + salario_estatutario);
      
    }
    
}