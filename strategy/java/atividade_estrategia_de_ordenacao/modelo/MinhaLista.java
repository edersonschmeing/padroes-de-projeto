package strategy.java.atividade_estrategia_de_ordenacao.modelo;

import java.util.Arrays;

import strategy.java.atividade_estrategia_de_ordenacao.strategy.BubbleSortStrategy;
import strategy.java.atividade_estrategia_de_ordenacao.strategy.OrdenacaoStrategy;

public class MinhaLista {
     
    private int [] elementos;
    
    private OrdenacaoStrategy strategy;  // estratégia de ordenação
    
    public MinhaLista(int [] elementos) {
        this.elementos = elementos;
        strategy = new BubbleSortStrategy(); // estratégia default: BubbleSort
    }
    
    public void setSortStrategy(OrdenacaoStrategy strategy) {
        this.strategy = strategy;  // permite mudar estratégia de ordenação
    }
    
    public void ordenar() {
        strategy.ordenar(elementos);
    }
    
    public void print() {
        System.out.println(Arrays.toString(elementos));
    }
    
}
