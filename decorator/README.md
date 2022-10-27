## Decorator

O Decorator é um padrão de projeto estrutural que permite que você acople novos comportamentos para objetos ao colocá-los dentro de embrulho(wrapper) de objetos que contém os comportamentos (Livro Mergulho nos Padrões de Projeto).

---
#### - Problema

Podemos adicionar comportamentos/funcionalidades de forma dinamica em um objeto?

#### - Solução

Através de objetos Decorators é possívem adicionar novas responsabílidades para um objeto.


#### - Aplicabilidade

Utilize o padrão Decorator quando você precisa ser capaz de projetar comportamentos adicionais para objetos em tempo de execução sem quebrar o código que usa esses objetos.

Utilize o padrão quando é complicado ou impossível estender o comportamento de um objeto usando herança.


#### - Vantagens

Pode-se estender o comportamento de um objeto sem fazer um nova subclasse.

Pode-se adicionar ou remover responsabilidades de um objeto no momento da execução.

Pode-se combinar diversos comportamentos ao envolver o objeto com múltiplos decoradores.

Princípio de responsabilidade única. Pode-se dividir uma classe monolítica que implementa muitas possíveis variantes de um comportamento em diversas classes menores.


#### - Desvantagens

É difícil remover um embrulho de uma pilha de embrulhos.

É difícil implementar um decorador de tal maneira que seu comportamento não dependa da ordem da pilha de decoradores.

A configuração inicial do código de camadas pode ficar bastante feia.

