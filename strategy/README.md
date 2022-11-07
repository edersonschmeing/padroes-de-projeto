
## Strategy

 O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles 
 intercambiáveis.(Livro Mergulho nos Padrões de Projeto).


Definir uma família de algoritmos, encapsular cada um, e fazê-los intercambiáveis. Strategy permite que algoritmos mudem independentemente entre clientes que os
utilizam (Livro GoF).

---
#### - Problema

Como uma classe pode usar um algoritmo definido dinamicamente?

Como podemos selecionar e trocar uma lógica em tempo de execução?

#### - Solução

Encapsular os possíveis algoritmos para o mesmo problema em uma estrutura de Strategy.

#### - Aplicabilidade

Utilize o padrão Strategy quando você quer usar diferentes variantes de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução.

Use o Strategy quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.

Utilize o padrão para isolar a lógica do negócio de uma classe dos detalhes de implementação de algoritmos que podem não ser tão importantes no contexto da lógica.

Use o padrão quando sua classe tem um operador condicional muito grande que troca entre diferentes variantes do mesmo algoritmo.

#### - Vantagens

Pode-se trocar algoritmos usados dentro de um objeto durante a execução.

Pode-se isolar os detalhes de implementação de um algoritmo do código que usa ele.

Pode-se substituir a herança por composição.

Princípio aberto/fechado. Você pode introduzir novas estratégias sem mudar o contexto.

#### - Desvantagens

Se só tem um par de algoritmos e eles raramente mudam, não há motivo real para deixar o programa mais complicado com novas classes e interfaces que vêm junto com o padrão.

Os clientes devem estar cientes das diferenças entre as estratégias para serem capazes de selecionar a adequada.

Muitas linguagens de programação modernas tem suporte do tipo funcional que permite que você implemente diferentes versões de um algoritmo dentro de um conjunto de funções anônimas. Então você poderia usar essas funções exatamente como se estivesse usando objetos estratégia, mas sem inchar seu código com classes e interfaces adicionais.
