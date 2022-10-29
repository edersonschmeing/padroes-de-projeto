package proxy.java.atividade_database.proxies;

import proxy.java.atividade_database.DAO.AlunoDAO;
import proxy.java.atividade_database.modelo.Aluno;

public class AlunoProxy implements Aluno {

    private String id;

    private Aluno aluno; 

    public AlunoProxy(String codigo) {
          this.id = codigo;
    }

    public String getNome() {
        this.aluno = AlunoDAO.getAlunoByID(this.id);
        return this.aluno.getNome();
    }

    public String getId() {
        return this.id;
    }
    
    
}
