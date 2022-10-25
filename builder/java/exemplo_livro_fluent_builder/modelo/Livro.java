package builder.java.exemplo_livro_fluent_builder.modelo;



public class Livro {
    
    private String nome;
    private String autores;
    private String editora;
    private String ano;
    
    public Livro (String nome, String autores, String editora, String ano) {
        this.nome = nome;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
    }
    
    public String toString() {
        return nome + ". " + autores + "," + editora + "," + ano;      
    }

}
