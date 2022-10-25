## Singleton

O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância (Livro Mergulho nos Padrões de Projeto).

Garantir que uma classe só tenha uma única instância e prover a ela um ponto de acesso global (Livro GoF).

---
#### - Problema

Como garantir que uma classe tenha apenas uma instância?

Como fazer para acessar de forma global a única instância?

#### - Solução

Definir um atributo/variável para guardar a instância da classe.

Não deixar instânciar a classe fora dela, colocar o construtor como privado. 

Definir um ponto/método de criação estático que retorne essa única instância. 

#### - Aplicabilidade

Utilize o padrão Singleton quando uma classe deve ter apenas uma instância disponível em seu software para todos seus clientes. Por exemplo, um objeto de base de dados único compartilhado por diferentes partes do software.

Utilize o padrão Singleton quando precisar de um controle mais rigoroso sobre as variáveis globais.

#### - Vantagens

Pode-se ter certeza que uma classe só terá uma única instância.

Ganha um ponto de acesso global para aquela instância.

O objeto singleton é inicializado somente quando for pedido pela primeira vez.

#### - Desvantagens

Viola o princípio de responsabilidade única. O padrão resolve dois problemas de uma só vez.

O padrão Singleton pode mascarar um design ruim, por exemplo, quando os componentes do programa sabem muito sobre cada um.

O padrão requer tratamento especial em um ambiente multithreaded para que múltiplas threads não possam criar um objeto singleton várias vezes.

Pode ser difícil realizar testes unitários do código cliente do Singleton porque muitos frameworks de teste dependem de herança quando produzem objetos simulados. Já que o construtor da classe singleton é privado e sobrescrever métodos estáticos é impossível na maioria das linguagem, você terá que pensar em uma maneira criativa de simular o singleton. Ou apenas não escreva os testes. Ou não use o padrão Singleton.




