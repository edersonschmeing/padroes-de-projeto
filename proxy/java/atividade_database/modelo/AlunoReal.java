package proxy.java.atividade_database.modelo;

public class AlunoReal implements Aluno {

    private String id;
    private String nome;
    
    public AlunoReal(String id, String nome) {
        this.id = id;
        this.nome = nome;
        System.out.println("Retorno da pessoa do banco de dados ->  " + nome);
    }

    public String getNome() {
        return nome;
    }
    
    public String getId() {
        return this.id;
    }
    
}
