## Abstract Factory

O Abstract Factory é um padrão de projeto criacional que permite produzir famílias de objetos relacionados sem ter que especificar suas classes concretas (Livro Mergulho nos Padrões de Projeto). 

Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas (Livro GoF).

---
#### - Problema

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como garantir que um conjunto de objetos relacionados ou dependentes possam ser criadas em um único contexto?

#### - Solução

Extrair o código de criação para um Abstract Factory.  

Criar uma implementação do Abstract Factory para cada contexto, garantindo assim que todos os objetos criados sejam do mesmo conjunto.

#### - Aplicabilidade


#### - Vantagens

Certeza que os objetos obtidos de uma fábrica são compatíveis. 

Evita um vínculo forte entre classes concretas e o código cliente.

Princípio de responsabilidade única. Pode-se extrair o código de criação dos objetos para um único lugar, fazendo o código ser de fácil manutenção.

Princípio aberto/fechado. Pode-se introduzir novas variantes do objetos sem quebrar o código cliente existente.

#### - Desvantagens

Complexidade no código,  uma vez que muitas novas interfaces e classes são introduzidas junto com o padrão.
