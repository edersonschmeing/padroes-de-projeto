package facade.java.exemplo_subsistema.facade;

import facade.java.exemplo_subsistema.modelo.SubSistemaA;
import facade.java.exemplo_subsistema.modelo.SubSistemaB;
import facade.java.exemplo_subsistema.modelo.SubSistemaC;

public class SubSistemaFacade {
    
    SubSistemaA subSistemaA = new SubSistemaA();
    SubSistemaB subSistemaB = new SubSistemaB();
    SubSistemaC subSistemaC = new SubSistemaC();

    public void operacaoAB()
    {
        subSistemaA.operacaoA();
        subSistemaB.operacaoB();
    }

    public void operacaoBC()
    {
        subSistemaB.operacaoB();
        subSistemaC.operacaoC();
    }
    
    public void operacaoAC()
    {
        subSistemaA.operacaoA();
        subSistemaC.operacaoC();
    }
    public void operacaoABC()
    {
        subSistemaA.operacaoA();
        subSistemaB.operacaoB();
        subSistemaC.operacaoC();
    }
    
}
