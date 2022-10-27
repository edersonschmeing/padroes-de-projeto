
## Prototype

O Prototype é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes (Livro Mergulho nos Padrões de Projeto).

Especificar os tipos de objetos a serem criados usando uma instância como protótipo e criar novos objetos ao copiar este protótipo (Livro GoF).

---
#### - Problema

Como podemos criar um objeto novo aproveitando o estado previamento existente em outro objeto?

#### - Solução

Definir um prototype que retorne uma copia de si mesmo.

#### - Aplicabilidade

Utilize o padrão Prototype quando seu código não deve depender de classes concretas de objetos que você precisa copiar.

Utilize o padrão quando você precisa reduzir o número de subclasses que somente diferem na forma que inicializam seus respectivos objetos. Alguém pode ter criado essas subclasses para ser capaz de criar objetos com uma configuração específica.

#### - Vantagens

Pode-se clonar objetos sem acoplá-los a suas classes concretas.

Pode-se se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.

Pode-se produzir objetos complexos mais convenientemente.

Uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

#### - Desvantagens

Clonar objetos complexos que têm referências circulares pode ser bem complicado.
