## Padrões de Projetos

Padrões de projeto são soluções para problemas comuns e frequentes em projetos de software. 

---
### Padrões Criacionais

Os padrões criacionais fornecem vários mecanismos de criação de objetos, que aumentam a flexibilidade e reutilização de código já existente.

#### - Factory Method

O [Factory Method](https://refactoring.guru/pt-br/design-patterns/factory-method) é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

[Implementação em Java](factory_method/java)


#### - Abstract Factory

O [Abstract Factory](https://refactoring.guru/pt-br/design-patterns/abstract-factory) é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

[Implementação em Java](abstract_factory/java)

#### - Builder

O [Builder](https://refactoring.guru/pt-br/design-patterns/builder) é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

[Implementação em Java](builder/java)

#### - Prototype

O [Prototype](https://refactoring.guru/pt-br/design-patterns/prototype) é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

[Implementação em Java](prototype/java)


#### - Singleton

O [Singleton](https://refactoring.guru/pt-br/design-patterns/singleton) é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.

[Implementação em Java](singleton/java)
 
---
### Padrões Estruturais

Os padrões estruturais explicam como montar objetos e classes em estruturas maiores mas ainda mantendo essas estruturas flexíveis e eficientes.

#### - Adapter

O [Adapter](https://refactoring.guru/pt-br/design-patterns/adapter) é um padrão de projeto estrutural que permite objetos com interfaces incompatíveis colaborarem entre si.

[Implementação em Java](adapter/java)

#### - Bridge

O [Bridge](https://refactoring.guru/pt-br/design-patterns/bridge) é um padrão de projeto estrutural que permite que você divida uma classe grande ou um conjunto de classes intimamente ligadas em duas hierarquias separadas—abstração e implementação—que podem ser desenvolvidas independentemente umas das outras. 


### Padrões Comportamentais

Padrões comportamentais são voltados aos algoritmos e a designação de responsabilidades entre objetos.


### Referências 

SHVETS, Alexander. Dive Into Design Patterns. 2021.
[Refactoring and Design Patterns](https://refactoring.guru/)

GAMMA, Erich; HELM, Richard; JOHNSON, Ralph; VLISSIDES, John. Design patterns: elements of reusable object-oriented software. Addison-Wesley, 1995.

VALENTE, Marco Tulio. Engenharia de Software Moderna: Princípios e Práticas para Desenvolvimento de Software com
Produtividade, 2020. [engsoftmoderna](https://engsoftmoderna.info/).

