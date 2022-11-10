
## Template Method

O Template Method é um padrão de projeto comportamental que define o esqueleto de um algoritmo na superclasse mas deixa as subclasses sobrescreverem etapas específicas do algoritmo sem  modificar sua estrutura (Livro Mergulho nos Padrões de Projeto).

Definir uma estrutura de um algoritmo dentro de uma operação, deixando algumas etapas a serem preenchidos pelas subclasses.
Template Method permite que suas subclasses redefinam certas etapas de um algoritmo sem mudar sua estrutura (Livro GoF).

---
#### - Problema

Como podemos unir partes de um código que não varia com partes variáveis?  

Como podemos alterar pontos específicos de um código mantendo uma estrutura geral?


#### - Solução

Definir uma abstração com todos os pontos que podem variar

Criar um template que contenha as partes fixas(que não variam) e chamadas para partes váriaveis. 


#### - Aplicabilidade

Utilize o padrão Template Method quando você quer deixar os clientes estender apenas etapas particulares de um algoritmo, mas não todo o algoritmo e sua estrutura.

Utilize o padrão quando você tem várias classes que contém algoritmos quase idênticos com algumas diferenças menores. Como resultado, você pode querer modificar todas as classes quando o algoritmo muda.

#### - Vantagens

Pode-se deixar clientes sobrescrever apenas certas partes de um algoritmo grande, tornando-os menos afetados por mudanças que acontece por outras partes do algoritmo.

Pode-se elevar o código duplicado para uma superclasse.

#### - Desvantagens

Alguns clientes podem ser limitados ao fornecer o esqueleto de um algoritmo.

Pode-se violar o princípio de substituição de Liskov ao suprimir uma etapa padrão de implementação através da subclasse.

Implementações do padrão Template Method tendem a ser mais difíceis de se manter quanto mais etapas eles tiverem.

