## Adapter

O Adapter é um padrão de projeto estrutural que permite objetos com interfaces(meio de comunicação) incompatíveis colaborarem entre si (Livro Mergulho nos Padrões de Projeto).

Converter a interface de uma classe em outra interface(meio de comunicação) esperada pelos clientes. Adapter permite comunicação entre classes que não poderiam trabalhar juntas devido à incompatibilidade de suas interfaces(meio de comunicação) (Livro GoF). 

---
#### - Problema

Como podemos reusar uma classe mesmo que ela não tenha interface(meio de comunicação) solicitada pelo cliente?

Como classes de interfaces(meio de comunicação) incompatíves podem trabalhar juntas?   

#### - Solução
   
Definir uma classe adapter que coverta a interface(meio de comunicação) de uma classe em outra interface(meio de comunicação) compatível com a nescessidade do cliente.

#### - Aplicabilidade

Utilize a classe Adapter quando usar uma classe existente, mas sua interface(meio de comunicação) não seja compatível com o resto do seu código.

Utilize o padrão quando reutilizar diversas subclasses existentes que não possuam alguma funcionalidade comum que não pode ser adicionada a superclasse.

#### - Vantagens

Princípio de responsabilidade única. Podemos separar a conversão de interface(meio de comunicação) ou de dados da lógica primária do negócio do programa.

Princípio aberto/fechado. Podemos introduzir novos tipos de adaptadores no programa sem quebrar o código cliente existente, desde que eles trabalhem com os adaptadores através da interface cliente.

#### - Desvantagens

A complexidade geral do código aumenta porque precisa-se introduzir um conjunto de novas interfaces e classes. Algumas vezes é mais simples mudar a classe serviço para que ela se adeque com o resto do seu código.

