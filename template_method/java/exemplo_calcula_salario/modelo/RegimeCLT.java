package template_method.java.exemplo_calcula_salario.modelo;

import template_method.java.exemplo_calcula_salario.template_method.Funcionario;;

public class RegimeCLT extends Funcionario {

    public RegimeCLT(double salario) {
        super(salario);
     }
     
     // implementa método abstrato
     protected double calcularDescontosPrevidencia() { 
        return salario * 0.1;   
     }
     
     // implementa método abstrato
     protected double calcularDescontosPlanoSaude() {
        return 100.0;
     }
     
     // implementa método abstrato 
     protected double calcularOutrosDescontos() {
       return 20.0;
     }


    
}
