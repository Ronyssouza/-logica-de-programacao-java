# Boas práticas de programação

## Consultas rápidas

- [Dúvidas gerais](dicas/geral.md)
- [Commits Semânticos](dicas/commits-semanticos.md)
- [Princípios para código de boa qualidade](dicas/principios-de-codificacao.md)
- [Controle de fluxo no Java](dicas/controle-de-fluxo-no-java.md)

## Abaixo estão questões Java que envolve lógica de programação e prática de orientação a objetos

## Questão 01

Crie um programa em Java que receba a lista de números inteiros {2, 5, 10, 15, 20, 25, 30} e verifique se cada número é par ou ímpar. Em seguida, o programa deve exibir uma mensagem informando se cada número é par ou ímpar.

Para isso, você deve declarar um array de inteiros com os valores da lista e percorrê-lo para verificar se cada número é par ou ímpar. O programa deve exibir uma mensagem para cada número, informando se ele é par ou ímpar.

## Questão 02

Suponha que você esteja desenvolvimendo um sistema de gerenciamento de estoque para uma loja de eletrônicos. Para isso, você precisa criar uma estrutura de dados que armazene as seguintes informações sobre cada produto: identificador único, nome, quantidade disponível em estoque e preço unitário.

Além disso, você precisa implementar algumas funcionalidades para manipular esses dados, incluindo:

* Calcular o valor total em estoque de um produto (quantidade x preço);
* Adicionar unidades de um produto ao estoque;
* Remover unidades de um produto do estoque.

Para testar o sistema, você deve criar um produto com as seguintes informações:

* identificador = 1
* nome = "Smartphone"
* quantidade = 10
* preço = 1500.00

Em seguinda, deve imprimir o valor total em estoque do produto, adicionar 5 unidades ao estoque e imprimir o valor total novamente,  Depois, deve remover 3 unidades do estoque e imprimir o valor total uma última vez.

## Questão 03

A tarefa consiste em criar um programa que calcule a média de idade, encontre a pessoa mais velha e a pessoa mais nova de um grupo de pessoas. Para isso, será necessário armazenar as informações de cada pessoa, como nome e idade, e criar um grupo de pessoas.

Adicione as informações de 5 pessoas ao grupo:

* Nome: Maria, Idade: 25
* Nome: João, Idade: 31
* Nome: Ana, Idade: 19
* Nome: Pedro, Idade: 42
* Nome: Juliana, Idade: 38

No final do programa, deve-se imprimir na tela a média de idade, o nome da pessoa mais velha e o nome da pessoa mais nova.

## Questão 04

Crie um programa que permita ao usuário gerenciar uma biblioteca de livros.
O programa deve ser capaz de cadastrar novos livros, excluir livros, buscar livros pelo título, autor ou categoria, e listar todos os livros cadastrados. 
Cada livro deve possuir um título, um autor, uma categoria e uma quantidade disponível em estoque.

O programa deve apresentar um menu de opções para o usuário, permitindo-o escolher qual ação deseja realizar. O menu deve conter as seguintes opções:

1. Cadastrar novo livro
2. Excluir livro
3. Buscar livro pelo título
4. Buscar livro pelo autor
5. Buscar livro pela categoria
6. Listar todos os livros cadastrados
7. Sair do programa

* Ao selecionar a opção 1, o usuário deverá informar o título, autor, categoria e quantidade disponível em estoque do livro a ser cadastrado.
* Ao selecionar a opção 2, o usuário deverá informar o título do livro a ser excluído.
* Ao selecionar as opções 3, 4 ou 5, o usuário deverá informar o critério de busca (título, autor ou categoria) e o valor correspondente.
* Ao selecionar a opção 6, o programa deve imprimir na tela todos os livros cadastrados, com suas informações completas.
* Ao selecionar a opção 7, o programa deve encerrar.

Caso o usuário informe valores inválidos ou tente realizar ações que não são possíveis (por exemplo, excluir um livro que não está cadastrado), o programa deve exibir mensagens de erro apropriadas e permitir que o usuário tente novamente.
