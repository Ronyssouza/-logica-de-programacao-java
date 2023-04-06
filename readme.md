# Boas práticas de programação

## Consultas rápidas

- [Dúvidas gerais](dicas/geral.md)
- [Comandos Git](dicas/comandos-git.md)
- [Commits Semânticos](dicas/commits-semanticos.md)
- [Sintaxe básica Java](dicas/sintaxe-basica-java.md)
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

Suponha que você esteja desenvolvendo um sistema bancário e precisa criar uma classe ContaBancaria para representar as contas dos clientes. Cada conta deve ter as seguintes informações: número da conta, nome do titular, saldo e limite de crédito.

Além disso, você deve implementar os seguintes métodos:

* depositar(valor) - adiciona o valor ao saldo da conta.
* sacar(valor) - retira o valor do saldo da conta, mas não pode ultrapassar o limite de crédito.
* consultarSaldo() - retorna o saldo atual da conta.
* consultarLimite() - retorna o limite de crédito da conta.
* imprimirExtrato() - imprime na tela as informações da conta: número da conta, nome do titular, saldo e limite de crédito.

Considere os seguintes valores para as contas:

Conta 1:

* número da conta: 12345
* nome do titular: João da Silva
* saldo: R$ 1000,00
* limite de crédito: R$ 500,00

Conta 2:

* número da conta: 67890
* nome do titular: Maria Souza
* saldo: R$ 500,00
* limite de crédito: R$ 1000,00

Conta 3:

* número da conta: 24680
* nome do titular: José Santos
* saldo: R$ 2000,00
* limite de crédito: R$ 200,00

Implemente a classe ContaBancaria em Java e crie objetos para cada conta. Realize as seguintes operações:

* Deposite R$ 500,00 na conta 1.
* Saque R$ 200,00 da conta 2.
* Imprima o extrato da conta 3.
* Tente sacar R$ 2000,00 da conta 1 e imprima a mensagem "Saldo insuficiente" caso o saque não seja possível.
* Tente sacar R$ 2300,00 da conta 3 e imprima a mensagem "Limite de crédito atingido" caso o saque não seja possível.

Saída esperada:

> Extrato da conta 3: <br/> 
  Número da conta: 24680 <br/>
  Nome do titular: José Santos <br/>
  Saldo: R$ 2000,00 <br/>
  Limite de crédito: R$ 200,00 <br/>
  Saldo insuficiente <br/>
  Limite de crédito atingido <br/>

## Questão 05

Uma empresa deseja promover seus funcionários de acordo com o tempo de serviço. Para isso, ela criou uma regra de promoção:

* Funcionários com mais de 5 anos de empresa receberão um aumento de 10% em seus salários.
* Funcionários com mais de 10 anos de empresa receberão um aumento de 15% em seus salários.

Crie um programa em Java que armazene as informações dos funcionários, como nome, salário e tempo de serviço. 

Em seguida, o programa deve calcular o novo salário de cada funcionário de acordo com as regras de promoção e imprimir na tela as informações atualizadas de cada funcionário.

Considere a seguinte lista de funcionários:

* João: salário R$ 2000, tempo de serviço 4 anos
* Maria: salário R$ 3000, tempo de serviço 8 anos
* Pedro: salário R$ 4000, tempo de serviço 12 anos

Ao final, o programa deve imprimir:

> João: salário R$ 2000, tempo de serviço 4 anos, novo salário R$ 2000 <br />
Maria: salário R$ 3000, tempo de serviço 8 anos, novo salário R$ 3450 <br />
Pedro: salário R$ 4000, tempo de serviço 12 anos, novo salário R$ 4600 <br />

## Questão 06

João é um mecânico e foi contratado para realizar o serviço de troca de óleo e verificação de pneus em três carros diferentes. 

Cada carro tem um modelo diferente e, portanto, requer uma quantidade diferente de óleo e o tipo de pneu também pode variar.

Os carros e suas especificações são:

* Carro 1: Modelo Fiat, requer 4 litros de óleo e pneus aro 15.
* Carro 2: Modelo Volkswagen, requer 5 litros de óleo e pneus aro 14.
* Carro 3: Modelo Ford, requer 6 litros de óleo e pneus aro 16.

João cobra R$ 50,00 pelo serviço de troca de óleo e R$ 20,00 pela verificação de cada pneu.

Crie um programa em Java que calcule o custo total do serviço realizado por João em cada um dos carros e imprima na tela.

Saída esperada:

> Custo total do serviço do carro 1: R$ 130,00 <br/>
Custo total do serviço do carro 2: R$ 150,00 <br/>
Custo total do serviço do carro 3: R$ 200,00 <br/>

## Questão 07

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
