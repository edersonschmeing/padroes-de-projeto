
## Observer

O Observer é um padrão de projeto comportamental que permite que você defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando. (Livro Mergulho nos Padrões de Projeto).

Definir uma dependência um-para-muitos entre objetos para que quando um objeto mudar de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.(Livro GoF).

---
#### - Problema

Como podemos modelar um relacionamento 1-N sem deixar todos eles acoplados.

Como um objeto pode notificar outros objetos quando necessário?

#### - Solução

Criar uma estrutura de Observer para que possa notificar todos os objetos que solicitaram ser avisados quando um determinado evento ocorra. 

#### - Aplicabilidade

Utilize o padrão Observer quando mudanças no estado de um objeto podem precisar mudar outros objetos, e o atual conjunto de objetos é desconhecido de antemão ou muda dinamicamente.

Use o padrão quando alguns objetos em sua aplicação devem observar outros, mas apenas por um tempo limitado ou em casos específicos.

#### - Vantagens

Princípio aberto/fechado. Você pode introduzir novas classes assinantes sem ter que mudar o código da publicadora (e vice versa se existe uma interface publicadora).

Você pode estabelecer relações entre objetos durante a execução.

#### - Desvantagens

Assinantes são notificados em ordem aleatória.

