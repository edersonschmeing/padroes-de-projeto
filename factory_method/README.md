## Factory Method

É um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados(Livro Mergulho nos Padrões de Projeto) 

Um padrão que define uma interface para criar um objeto, mas permite às classes decidirem qual classe instanciar. O Factory Method permite a uma classe deferir a
instanciação para subclasses(Livro GOF)

---
#### - Problema

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como deixar o código desacoplado das classes concretas? 

#### - Solução

Extrair o código de criação para um Factory Method.  

Invocar o Factory Method para receber uma instância qualquer que implemente um determinada interface.

#### - Aplicabilidade

#### - Vantagens

 Você evita acoplamentos firmes entre o criador e os produtos concretos.
 
 Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
 
 Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.
 
#### - Desvantagens
 
O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.

