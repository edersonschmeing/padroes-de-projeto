/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Builder
*
*/


package builder.java.exemplo_livro_fluent_builder;

import builder.java.exemplo_livro_fluent_builder.builder.LivroBuilder;
import builder.java.exemplo_livro_fluent_builder.modelo.Livro;


public class Cliente {

    public static void main(String [] args) {
     
        Livro esm = new LivroBuilder().setNome("Engenharia Soft Moderna")
                                      .setEditora("UFMG")
                                      .setAno("2020")
                                      .build();
        System.out.println("Livro 1: " + esm.toString());
        
        Livro gof = new LivroBuilder().setNome("Design Patterns")
                                      .setAutores("GoF")
                                      .setAno("1995")
                                      .build();

        System.out.println("Livro 2: " + gof.toString());         
        
        Livro outroLivro = new LivroBuilder().setNome("Outro livro")
                                             .build();

        System.out.println("Livro 3: " + outroLivro.toString());           

     }

    
}
