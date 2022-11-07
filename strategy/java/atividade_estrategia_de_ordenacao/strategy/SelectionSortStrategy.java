package strategy.java.atividade_estrategia_de_ordenacao.strategy;

public class SelectionSortStrategy extends OrdenacaoStrategy {

    public void ordenar(int[] elementos) {  
        for (int i = 0; i < elementos.length - 1; i++) {  
          int index = i;  
          for (int j = i + 1; j < elementos.length; j++) {  
              if (elementos[j] < elementos[index]) {  
                 index = j;
              }  
          }  
          int smallerNumber = elementos[index];   
          elementos[index] = elementos[i];  
          elementos[i] = smallerNumber;  
        }  
      }
    
}
