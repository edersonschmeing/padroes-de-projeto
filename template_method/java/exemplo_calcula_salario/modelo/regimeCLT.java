package template_method.java.exemplo_calcula_salario.modelo;

import template_method.java.exemplo_calcula_salario.template_method.Funcionario;;

public class regimeCLT extends Funcionario {

    public regimeCLT(double salario) {
        super(salario);
     }
     
     // implementa método abstrato
     public double calcularDescontosPrevidencia() { 
        return salario * 0.1;   
     }
     
     // implementa método abstrato
     public double calcularDescontosPlanoSaude() {
        return 100.0;
     }
     
     // implementa método abstrato 
     public double calcularOutrosDescontos() {
       return 20.0;
     }


    
}
