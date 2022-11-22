
## Chain of Responsibility (Corrente de responsabilidade)

O Chain of Responsibility é um padrão de projeto comportamental que permite que você passe pedidos por uma corrente de handlers. Ao receber um pedido, cada handler(processador/manipulador) decide se processa o pedido ou o passa adiante para o próximo handler na corrente (Livro Mergulho nos Padrões de Projeto).

Evita acoplar o remetente de uma requisição ao seu destinatário ao dar a mais de um objeto a chance de servir a requisição. Compõe os objetos em cascata e passa a requisição pela corrente até que um objeto a sirva (Livro GoF).

---
#### - Problema

Como evitamos o acomplamente entre o rementente de um solicitação e seu receptor? 

Como permitimos que mais de um objeto possa atender alguma solicitação?


#### - Solução

Definir uma cadeia de objetos odne cada objeto dessa cadeia pode responder a solicitação ou enviar para o próximo objeto. 

O solicitante não precisa saber o tamanho da cadeia, como e por quem será resolvida. 


#### - Aplicabilidade

Utilize o padrão Chain of Responsibility quando é esperado que seu programa processe diferentes tipos de pedidos em várias maneiras, mas os exatos tipos de pedidos e suas sequências são desconhecidos de antemão.

Utilize o padrão quando é essencial executar diversos handlers em uma ordem específica.

Utilize o padrão quando o conjunto de handlers e suas encomendas devem mudar no momento de execução.


#### - Vantagens

Você pode controlar a ordem de tratamento dos pedidos.

Princípio de responsabilidade única. Você pode desacoplar classes que invocam operações de classes que realizam operações.

Princípio aberto/fechado. Você pode introduzir novos handlers na aplicação sem quebrar o código cliente existente.

#### - Desvantagens

Alguns pedidos podem acabar sem tratamento.
