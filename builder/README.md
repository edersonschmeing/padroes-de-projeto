
## Builder

O Builder é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção(Livro Mergulho nos Padrões de Projeto).


Separar a construção de um objeto complexo de sua representação para que o mesmo processo de construção
possa criar representações diferentes(Livro GoF).

---
#### - Problema

Como uma classe pode criar diferentes representações de um mesmo objeto complexo?

#### - Solução

Delegar a criação do objeto para um Builder ao invés de instanciar o objeto concreto diretamente. 

Dividir a criação do objeto em partes. 

Encapsular a criação e montagem das partes em um Builder separado.

#### - Vantagens

Pode-se construir objetos passo a passo, adiar as etapas de construção ou rodar etapas recursivamente.

Pode-se reutilizar o mesmo código de construção quando construindo várias representações de produtos.

Princípio de responsabilidade única. Você pode isolar um código de construção complexo da lógica de negócio do produto.

#### - Desvantagens

Complexidade geral do código aumenta uma vez que o padrão exige criar múltiplas classes novas.
