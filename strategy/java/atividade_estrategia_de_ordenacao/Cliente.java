/**
* Engenharia de Software Moderna - Padrões de Projeto (Cap. 6)
* Prof. Marco Tulio Valente
* 
* Exemplo do padrão de projeto Strategy
*
*/

package strategy.java.atividade_estrategia_de_ordenacao;

import strategy.java.atividade_estrategia_de_ordenacao.modelo.MinhaLista;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.SelectionSortStrategy;

public class Cliente {

    public static void main(String[] args) {
        System.out.println("Lista #1 foi ordenada com a estratégia default: BubbleSort");
        
        int [] elementos1 = {3,5,2,4,1,6};
        MinhaLista lista1 = new MinhaLista(elementos1);
        lista1.ordenar(); // ordena lista usando estratégia default: Bubble Sort
        lista1.print();
        
        System.out.println("\nLista #2 foi ordenada com uma outra estratégia: SelectionSort");
        
        int [] elems2 = {6,5,4,3,2,1};
        MinhaLista lista2 = new MinhaLista(elems2);
        lista2.setSortStrategy(new SelectionSortStrategy());
        lista2.ordenar(); // ordena lista usando Selection Sort
        lista2.print(); 
        
        
        /* Implemente pelo menos mais uma estratégia de ordenação    
         * 
         *  insertionsort 
            shellsort 
            mergesort 
            quicksort
            quicksort2
            heapsort
            heapsort
            bucketsort 
          */
        
        //System.out.println("\nLista #3 foi ordenada com uma outra estratégia: ????????");
             
      }

}
