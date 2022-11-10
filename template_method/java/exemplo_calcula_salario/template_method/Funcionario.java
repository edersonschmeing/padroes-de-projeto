/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Template Method
*
*/

/**
* Classe que implementa um Template Method (calculaSalarioLiquido)
* Veja que essa classe é abstrata
*/

package template_method.java.exemplo_calcula_salario.template_method;

public abstract class Funcionario {
    
    protected double salario;

    public Funcionario(double salario) {
      this.salario = salario;
    }
   
    public abstract double calcularDescontosPrevidencia();
    
    public abstract double calcularDescontosPlanoSaude();
    
    public abstract double calcularOutrosDescontos();
 
    /**
    * Template Method: define a estrutura de um algoritmo
    * Ele ainda é um "template" porque os métodos chamados são abstratos
    */
    public double calculaSalarioLiquido() { 
  
      double previdencia = calcularDescontosPrevidencia();
      double plano_de_saude = calcularDescontosPlanoSaude();
      double outros_descontos = calcularOutrosDescontos();
  
      return salario - previdencia - plano_de_saude - outros_descontos;

    }
 }
