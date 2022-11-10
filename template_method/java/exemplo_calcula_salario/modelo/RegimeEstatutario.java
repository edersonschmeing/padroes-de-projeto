package template_method.java.exemplo_calcula_salario.modelo;

import template_method.java.exemplo_calcula_salario.template_method.Funcionario;;

public class RegimeEstatutario extends Funcionario {

    public RegimeEstatutario(double salario) {
        super(salario);
     }
     
     // implementa método abstrato
     protected double calcularDescontosPrevidencia() { 
        return salario * 0.08;   
     }
     
     // implementa método abstrato
     protected double calcularDescontosPlanoSaude() {
        return 50.0;
     }
     
     // implementa método abstrato 
     protected double calcularOutrosDescontos() {
       return 30.0;
     }


    
}
