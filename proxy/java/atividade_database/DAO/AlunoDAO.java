package proxy.java.atividade_database.DAO;

import proxy.java.atividade_database.modelo.Aluno;
import proxy.java.atividade_database.modelo.AlunoReal;

public class AlunoDAO {
    
    public static Aluno getAlunoByID(String id){
          
        System.out.println("SELECT * FROM ALUNO WHERE ID = "+ id);       
        return new AlunoReal(id, "Aluno " + id);

    }

}