
## Proxy

O Proxy é um padrão de projeto estrutural que permite que você forneça um substituto ou um espaço reservado para outro objeto. Um proxy controla o acesso ao objeto original, permitindo que você faça algo ou antes ou depois do pedido chegar ao objeto original (Livro Mergulho nos Padrões de Projeto).

Fornecer um substituto ou ponto através do qual um objeto possa controlar o acesso a outro (Livro GoF).

---
#### - Problema

Como controlar o acesso a algum abjeto?

Como adicionar funcionalidae durante o acesso a algum objeto?

#### - Solução

Usar uma estrutura de Proxy para atuar como se fosse outro objeto.

Utilizar o Proxy como forma de acessar o objeto real. 

#### - Aplicabilidade

Inicialização preguiçosa (Virtual proxy). Um objeto do serviço peso-pesado que gasta recursos do sistema por estar sempre rodando, mesmo quando precisa-se dele de tempos em tempos.

Controle de acesso (Protection proxy). Necessidade de que apenas clientes específicos usem o objeto do serviço. Exemplo, 
quando seus objetos são partes cruciais de um sistema operacional e os clientes são várias aplicações iniciadas (incluindo algumas maliciosas).

Execução local de um serviço remoto (Remote proxy). Quando o objeto do serviço está localizado em um servidor remoto.

Registros de pedidos (proxy de registro). Necessidade de manter um histórico de pedidos ao objeto do serviço.

Cache de resultados de pedidos (proxy de cache). Necessidade de colocar em cache os resultados de pedidos do cliente e gerenciar o ciclo de vida deste cache,
especialmente se os resultados são muito grandes.

Referência inteligente (Smart proxy ). Para quando precisa-se ser capaz de se livrar de um objeto peso-pesado assim que não há mais clientes que o usam.

#### - Vantagens

Controlar o objeto do serviço sem os clientes ficarem sabendo.

Gerenciar o ciclo de vida de um objeto do serviço quando os clientes não se importam mais com ele.

O proxy trabalha até mesmo se o objeto do serviço ainda não está pronto ou disponível.

Princípio aberto/fechado. Introduzir novos Proxies sem mudar o serviço ou clientes.


#### - Desvantagens

O código pode ficar mais complicado uma vez que você precisa introduzir uma série de novas classes.

A resposta de um serviço pode ter atrasos.

