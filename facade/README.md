
## Facade

O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes (Livro Mergulho nos Padrões de Projeto).

Fornecer uma interface única para um conjunto de interfaces de um subsistema. Facade define uma interface de nível mais elevado que torna o subsistema mais fácil de utilizar (Livro GoF).

---
#### - Problema

Como simplificar o acesso a um software complexo usando uma interface simples? 

Como reduzir a complexidade interna de um software para o cliente? 

#### - Solução

Definir uma fachada que fornecer uma interface única para um conjunto de interfaces de um software.

#### - Aplicabilidade

Utilize o padrão Facade quando você precisa ter uma interface limitada mas simples para um subsistema complexo.

Utilize o Facade quando você quer estruturar um subsistema em camadas.

#### - Vantagens

Isolar o código da complexidade de um subsistema.

#### - Desvantagens

Uma fachada pode se tornar um objeto deus acoplado a todas as classes de uma aplicação.
