package builder.java.exemplo_livro_fluent_builder.builder;

import builder.java.exemplo_livro_fluent_builder.modelo.Livro;

public class LivroBuilder {
    
    private String nome;
    private String autores;
    private String editora;
    private String ano; 
    
    
    public LivroBuilder setNome(String nome) {
       this.nome = nome;
       return this;
    }

    public LivroBuilder setAutores(String autores) {
       this.autores = autores;
       return this;
    }
    
    public LivroBuilder setEditora(String editora) {
       this.editora = editora;
       return this;
    }
    
    public LivroBuilder setAno(String ano) {
       this.ano = ano;
       return this;
    }
    
    public Livro build() {
       return new Livro(nome, autores, editora, ano); 
    }
 }