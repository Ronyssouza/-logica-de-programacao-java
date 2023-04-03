Resumo Do enunciado (Sintaxe Basica Java)

//-->Quais são tipos de (dados)<--
		Em Java, existem diferentes tipos de dados que podem ser usados para armazenar diferentes tipos de valores. 
		Alguns dos principais tipos de dados em Java são:
		byte: / short: / int:/ long: / float:/ double:/ bollean:/ char:/ 
	
#// tipo em referencia em java <--
		*String <-- "S" Maiusculo Sequecia de caracteres
		*Object: Classe base para todos os tipos de objetos em java
		*Array: Coleção de elementos do mesmo tipo
		
		Por exemplo, ClasseConta acao = new ClasseConta(), 
		cria um objeto de classe ClasseConta e a variável acao contém uma referência a esse objeto ClasseConta, 
		onde poderá invocar todos os seus métodos e atributos da classe. 
		A palavra chave new solicita a memória do sistema para armazenar um objeto e inicializa o objeto.
		
##//Estrutura de condicionais
		estruturas de condicionais permitem que um programa execute diferentes ações dependendo de uma condição especificada.
		por exemolo 
		if / else:
		A estrutura "if / else" permite que você execute diferentes ações dependendo de uma condição.
			
		int x = 10;
		if (x < 5) {
		  System.out.println("x é menor que 5");
		} else {
		  System.out.println("x é maior ou igual a 5");
		}
		
		Switch	
		A estrutura "switch" é usada quando há várias condições possíveis e você deseja executar diferentes ações dependendo do valor de uma variável. 
		Por exemplo:
		int diaDaSemana = 4;
				switch (diaDaSemana) {
				  case 1:
					System.out.println("Segunda-feira");
					break;
				  case 2:
					System.out.println("Terça-feira");
					break;
				  case 3:
					System.out.println("Quarta-feira");
					break;
					default:
						System.out.println("Dia inválido");
						break;
}
##//Operador ternário:
		O operador ternário é uma forma abreviada da estrutura 
		"if / else" e é usado para atribuir um valor a uma variável dependendo de uma condição. Por exemplo:
	    
		int x = 10;
		String mensagem = x < 5 ? "x é menor que 5" : "x é maior ou igual a 5";
		System.out.println(mensagem);

##//Laços de repetição
		Em Java, existem três tipos de laços de repetição (também conhecidos como loops): 
		"for", "while" e "do-while". 
		Cada tipo de laço é adequado para diferentes situações, dependendo da forma como a repetição deve ocorrer.
		Laço "for":
		é usado quando o número de iterações é conhecido antecipadamente. A sintaxe básica do laço "for" é:
		for (int i = 1; i <= 10; i++) { //  numero ja conhecido dentro do for 
		  System.out.println(i);
		}
		Laço "while":
		O laço "while" é usado quando o número de iterações não é conhecido antecipadamente e depende de uma condição. 
		A sintaxe básica do laço "while" é:
		int i = 1;
		while (i <= 10) {
		  System.out.println(i);
		  i++;
		}
		Laço "do-while":
		O laço "do-while" é semelhante ao laço "while", mas garante que o bloco de código seja executado pelo menos uma vez, 
		mesmo que a condição seja falsa. A sintaxe básica do laço "do-while" é:
		int i = 1;
		do {
		  System.out.println(i);
		  i++;
		} while (i <= 10);
		É importante lembrar que, em todos os tipos de laços, é possível usar as instruções 
		"break" e "continue" para controlar o fluxo da repetição.
								
##//Construtores
Em Java, um construtor é um método especial usado para criar e inicializar objetos de uma classe. 
Quando você cria um objeto usando a palavra-chave "new", 
quadoo construtor da classe é chamado automaticamente para inicializar os valores das variáveis ​​de instância do objeto.

Nesse exemplo, o construtor recebe dois parâmetros (nome e idade) 
e usa o operador this para se referir aos atributos da classe que têm os mesmos nomes dos parâmetros.
O construtor é usado para definir o estado inicial dos objetos da classe Pessoa.

		    public class Pessoa {
			private String nome;
			private int idade;

			public Pessoa(String nome, int idade) {
				this.nome = nome;
				this.idade = idade;
			}
		}
##//Excepcion
é um objeto que representa uma situação excepcional que ocorreu durante a execução de um programa. 
Quando uma exceção é lançada, o fluxo normal de execução do programa é interrompido
e o controle é transferido para um bloco de código especial chamado "tratador de exceção" (exception handler) 
que pode lidar com a exceção e permitir que o programa continue executando normalmente.
		public void dividir(int dividendo, int divisor) throws ArithmeticException {
		if (divisor == 0) {
			throw new ArithmeticException("Divisor não pode ser zero.");
		}
		int resultado = dividendo / divisor;
		System.out.println("Resultado da divisão: " + resultado);
	}
	
##//  Declaração de classe
		
	a declaração da classe começa com a palavra-chave public, que indica que a classe é pública e pode ser acessada por outras classes.
	a Declaração de Classe (Class Declaration) é a estrutura básica para a criação de uma classe, 
	que é um modelo ou um molde para a criação de objetos. 
	A declaração da classe consiste em um cabeçalho que indica o nome da classe e, opcionalmente, sua superclasse 
	(a classe que ela herda) e as interfaces que ela implementa.
	exemplo-->
	public class Produto {

		  private String nome;
		  private int quantidade;

		  public Produto() {
			
		  }

		  public void apresentarProduto() {
			
		  }

		}
	Regras para nomer uma classe --> 
		
	*anter o nome simples e descritivo;
	*sar palavras inteiras, isto é, sem siglas e abreviações;
	* primeira letra de cada palavra deve estar em caixa alta.
	
	Para utilizar uma classe devemos declará-la da mesma maneira que se declara uma variável de tipo primitivo.
	
	Produto produtoUm;
	produtoUm = new Produto();
	produtoUm.apresentarProduto();
	
	Quando uma classe precisa herdar características de outra, fazemos uso de herança, conceito da orientação a objetos que em Java 
	é representado pela palavra-chave extends.
	Sintaxe de declaração de herança:
		exemplo
		public class Produto {

		  public double valorCompra;
		  protected double valorVenda;

		}

		public class Computador extends Produto {

		   private String processador;

}
##// Declaração de método
é a estrutura usada para definir um método dentro de uma classe. 
Um método é uma sub-rotina que executa uma ação específica e pode receber parâmetros e retornar um valor.
A Declaração de Método começa com um modificador de acesso 
(public, protected ou private), seguido do tipo de retorno do método (void para métodos que não retornam nenhum valor ou o tipo de dados do valor retornado)
, o nome do método e, entre parênteses, uma lista de parâmetros separados por vírgulas.

		public class Exemplo {
		   // Variáveis de instância
		   private int idade;
		   private String nome;

		   // Construtor
		   public Exemplo(int idade, String nome) {
			  this.idade = idade;
			  this.nome = nome;
		   }

		   // Método
		   public void imprimir() {
			  System.out.println("Nome: " + nome + ", Idade: " + idade);
		   }
		}
Para chamar um método em Java, é preciso criar um objeto da classe que o contém e usar o operador . para acessá-lo.
	Exemplo obj = new Exemplo(20, "João");
	obj.imprimir();
	
	As classes que armazenam esses métodos são conhecidas como projetos de objetos, onde são definidos os atributos que 
	o objeto terá e os métodos projetados para realizar as tarefas da classe.
		
##//operadores em java

	operadores são símbolos especiais que permitem realizar operações entre variáveis e valores. 
	Existem diversos tipos de operadores em Java, que podem ser classificados de acordo com a sua função e a sua precedência.
	Operadores Aritméticos: Usados para realizar operações matemáticas básicas, como soma, subtração, multiplicação, divisão e resto da divisão. 
	Alguns exemplos de operadores aritméticos em Java são +, -, *, /, %.

	Operadores de Atribuição: Usados para atribuir um valor a uma variável. O operador de atribuição básico em Java é =.
	
	Operadores de Comparação: Usados para comparar dois valores e retornar um resultado booleano (true ou false). 
	Alguns exemplos de operadores de comparação em Java são == (igualdade), != (diferença), < (menor que), > (maior que), <= (menor ou igual a), >= (maior ou igual a).
	
	Operadores Lógicos: Usados para combinar ou negar expressões booleanas. 
	Os operadores lógicos em Java são && (e lógico), || (ou lógico) e ! (negação lógica).
	
	Operadores Ternários: Usados para avaliar uma expressão booleana e retornar um valor baseado no resultado. O operador ternário em Java é ? :.
	Operadores de Incremento e Decremento: Usados para incrementar ou decrementar o valor de uma variável em uma unidade. 
	Os operadores de incremento em Java são ++ (incremento) e -- (decremento).
	
	
##//Declaração de array
		é um objeto que armazena uma coleção de valores do mesmo tipo em uma única estrutura de dados. 
		A declaração de um array em Java envolve especificar o tipo de dados dos elementos do array, seguido pelo nome do array e, opcionalmente, 
		pelo seu tamanho.
		sintaxe de inicialização de array, que consiste em colocar os valores do array entre chaves ({}), separados por vírgulas.
		-->exemplo 
		
		int[] numeros = {1, 2, 3, 4};
		O índice de um elemento em um array começa em zero e vai até o tamanho do array menos um. 
		Por exemplo, para acessar o segundo elemento do array 
		
		int segundoNumero = numeros[1];
		==============================================================================================
		
##// Estruturas de controle de fluxo

Em programação, as estruturas de controle de fluxo em Java são usadas para controlar 
a ordem em que as instruções do programa são executadas. 
Elas permitem que o programa tome decisões com base em determinadas condições ou itere repetidamente através de um bloco de código.

##--> principais estruturas de controle de fluxo

	Estruturas condicionais: como o "if-else" e o "switch", que permitem que o programa execute diferentes ações com base em determinadas condições.

	Estruturas de loop: como o "for", "while" e "do-while", que permitem que o programa execute um bloco de código repetidamente enquanto uma condição for verdadeira.

	struturas de controle de exceções: como "try-catch-finally", que permitem que o programa lide com exceções (erros) que podem ocorrer durante a execução do código.

	Ao utilizar essas estruturas de controle de fluxo em Java, é possível criar programas mais flexíveis e dinâmicos, capazes de responder de maneira adequada a diferentes situações.

##// Orientação a objetos

	* Classes e objetos
	Em Java, uma classe é um modelo que descreve a estrutura e o comportamento de um objeto. 
	Ela define os atributos e métodos que um objeto desse tipo deve ter, mas não cria uma instância desse objeto diretamente.,
	Por outro lado, um objeto é uma instância de uma classe. 
	É criado a partir da classe e contém seus próprios valores para os atributos definidos na classe. 
	Um objeto também pode chamar os métodos definidos na classe para executar operações ou realizar tarefas específicas.
	Já um objeto é uma instância de uma classe. É como uma variável que é criada a partir de uma classe, 
	com as propriedades e métodos definidos pela classe.
	
	Em resumo, uma classe é uma definição genérica de um conjunto de objetos com características e comportamentos semelhantes, 
	enquanto um objeto é uma instância específica de uma classe com seus próprios valores para as propriedades definidas na classe.

##// -->  Encapsulamento
  o encapsulamento permite que os detalhes internos de implementação de um objeto sejam ocultados,
  protegidos e gerenciados por meio de métodos e propriedades que determinam como o objeto pode ser acessado e modificado.
  
##// henrança
  Em Java, a herança é um recurso da programação orientada a objetos que permite que uma classe herde atributos e métodos de outra classe. 
  A classe que herda é chamada de subclasse ou classe filha, e a classe que é herdada é chamada de superclasse ou classe pai.
  A herança em Java permite que você crie uma hierarquia de classes, onde as classes mais específicas herdam características das classes mais gerais.
  Para definir uma classe filha em Java, você usa a palavra-chave "extends". 
  Por exemplo, se você tiver uma classe chamada "Animal" e quiser criar uma subclasse chamada "Cachorro",
  
  **exemplo de sintaxe **
		  // classe pai ou superclasse
			class Pessoa {
			private String nome;
			private int idade;

			public Pessoa(String nome, int idade) {
				this.nome = nome;
				this.idade = idade;
			}

			public void exibirDados() {
				System.out.println("Nome: " + nome);
				System.out.println("Idade: " + idade);
			}
		}

		// classe filha ou subclasse
			class Estudante extends Pessoa {
			private String curso;

			public Estudante(String nome, int idade, String curso) {
				super(nome, idade);
				this.curso = curso;
			}

			public void exibirDados() {
				super.exibirDados();
				System.out.println("Curso: " + curso);
			}
		}

		// uso das classes
				public class ExemploHeranca {
				public static void main(String[] args) {
				Pessoa pessoa = new Pessoa("João", 25);
				pessoa.exibirDados();

				Estudante estudante = new Estudante("Maria", 20, "Ciência da Computação");
				estudante.exibirDados();
			}
		}
=============================================================================================
		
		é a capacidade de um objeto assumir várias formas, permitindo que ele seja referenciado por diferentes tipos. 
		Isso é possível graças à herança e à capacidade de sobrescrever métodos em classes filhas.
		
		O polimorfismo pode ser implementado em Java usando classes abstratas, interfaces e classes com métodos virtuais. 
		O polimorfismo permite escrever código mais genérico, reutilizável e fácil de manter, além de ser um conceito 
		fundamental da programação orientada a objetos.
		
		*exemplo de polimorfismo --->*
		// Classe pai ou superclasse
		class Animal {
			public void fazerSom() {
				System.out.println("Som de animal desconhecido.");
			}
		}

		// Classe filha ou subclasse
		class Cachorro extends Animal {
			public void fazerSom() {
				System.out.println("Au au!");
			}
		}

		// Classe filha ou subclasse
		class Gato extends Animal {
			public void fazerSom() {
				System.out.println("Miau!");
			}
		}

		// Uso das classes
		public class ExemploPolimorfismo {
			public static void main(String[] args) {
				Animal animal1 = new Cachorro();
				Animal animal2 = new Gato();
				animal1.fazerSom();
				animal2.fazerSom();
			}
		}
		
		====================================================================
		
##// Sobrescrita de metodos 

	A sobrescrita de métodos em Java é a capacidade de uma classe filha substituir a implementação de um método definido na classe pai.
	Para sobrescrever um método, a classe filha deve definir um método com o mesmo nome, 
	tipo de retorno e lista de parâmetros da classe pai. A palavra-chave -->"@Override" 
	pode ser usada para indicar explicitamente que um método está sendo sobrescrito.
	 
	 *Exemplo de sobrescrita De metodos ->*
	// Classe pai ou superclasse
		class Animal {
			public void fazerSom() {
				System.out.println("Som de animal desconhecido.");
			}
		}

		// Classe filha ou subclasse
		class Cachorro extends Animal {
			@Override
			public void fazerSom() {
				System.out.println("Au au!");
			}
		}

		// Uso das classes
		public class ExemploSobrescritaMetodos {
			public static void main(String[] args) {
				Animal animal = new Cachorro();
				animal.fazerSom();
			}
		}
		======================================================================
		
##//Interfaces

	Uma interface em Java é uma coleção de métodos abstratos e constantes que podem ser implementados por classes diferentes de forma independente 
	da hierarquia de herança.

	Em outras palavras, uma interface define um conjunto de comportamentos que uma classe deve implementar, 
	sem especificar como esses comportamentos são implementados. 
	As classes que implementam uma interface devem fornecer uma implementação para cada um dos métodos definidos na interface.
	
	As interfaces em Java são declaradas usando a palavra-chave interface 
	e os métodos na interface são declarados sem corpo, ou seja, eles são definidos como métodos abstratos.
	
	*exemplo interface -->*
	// Exemplo de interface
		interface Animal {
			void fazerSom();
			void comer();
		}

		// Exemplo de classe que implementa a interface Animal
		class Cachorro implements Animal {
			@Override
			public void fazerSom() {
				System.out.println("Au au!");
			}

			@Override
			public void comer() {
				System.out.println("Comendo ração.");
			}
		}

		// Uso da interface e classe que a implementa
		public class ExemploInterfaces {
			public static void main(String[] args) {
				Animal animal = new Cachorro();
				animal.fazerSom();
				animal.comer();
			}
		}
		
		=========================================================
		
##//Classe abstratas

	Uma classe abstrata em Java é uma classe que não pode ser instanciada diretamente, mas é destinada a ser estendida por outras classes.

Essa classe abstrata pode incluir tanto métodos abstratos quanto métodos concretos (implementados).
 No entanto, se uma classe abstrata contiver pelo menos um método abstrato, então a classe em si também deve ser declarada como abstrata.
 As classes abstratas são declaradas usando a palavra-chave "abstract."
 Elas não podem ser instanciadas, mas podem ser usadas como tipos de variáveis ou referências.
 
 *exemplo de classe abstrata*
		 // Classe abstrata com um método abstrato e um método concreto
		abstract class Animal {
			public void mover() {
				System.out.println("O animal está se movendo.");
			}

			public abstract void fazerSom();
		}

		// Classe que estende a classe abstrata Animal
		class Cachorro extends Animal {
			@Override
			public void fazerSom() {
				System.out.println("Au au!");
			}
		}

		// Uso da classe abstrata e classe que a estende
		public class ExemploClasseAbstrata {
			public static void main(String[] args) {
				Animal animal = new Cachorro();
				animal.mover();
				animal.fazerSom();
			}
		}
		
		=========================================================================
		
		
##// Tratamento de exceções
	Bloco Try-catch 
	
	Em Java, os blocos try-catch são usados para lidar com exceções, que são condições imprevistas que ocorrem durante a execução do programa 
	e podem interromper o fluxo normal de execução.
	O bloco try é usado para envolver o código que pode potencialmente lançar uma exceção. 
	Se uma exceção é lançada dentro do bloco try, o controle é transferido para o bloco catch correspondente que pode tratar a exceção.
	O bloco catch é usado para capturar e manipular exceções. 
	Ele especifica o tipo de exceção que deve ser tratada e fornece um bloco de código que lida com a exceção.
	bloco try pode ter vários blocos catch para tratar diferentes tipos de exceções.
	O bloco finally é usado para executar o código que deve ser executado independentemente de ocorrer ou não uma exceção. 
	O bloco finally é executado depois do bloco try e do bloco catch, mesmo que ocorra uma exceção.
	
	*Exemplo do bloco try-catch*
		public class ExemploTryCatch {
		public static void main(String[] args) {
			try {
				int x = 10 / 0; // divisão por zero
			} catch (ArithmeticException e) {
				System.out.println("Ocorreu uma exceção: " + e.getMessage());
			} finally {
				System.out.println("O bloco finally sempre é executado.");
			}
		}
	}
	Neste exemplo, o bloco try envolve uma divisão por zero, que resulta em uma exceção ArithmeticException. 
	O bloco catch captura a exceção e exibe uma mensagem de erro. O bloco finally é usado para exibir uma mensagem 
	que é sempre executada, independentemente de ocorrer ou não uma exceção.
	O código produz a saída "Ocorreu uma exceção: / by zero" e "O bloco finally sempre é executado.", 
	demonstrando o uso básico de blocos try-catch em Java.
	======================================================================================
	
##//Tipos de exceção
	Em Java, existem dois tipos de exceções: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).
	As exceções verificadas são exceções que o compilador obriga o programador a tratar ou propagar, 
	ou seja, o programador é obrigado a lidar com essas exceções explicitamente, caso contrário, o código não será compilado. 
	
	Alguns exemplos de exceções --> verificadas incluem 'IOException', 'ClassNotFoundException', 'SQLException'.
	
	Alguns exemplos de exceções --> não verificadas incluem 'NullPointerException', 'ArrayIndexOutOfBoundsException', 'IllegalArgumentException'.
	
	É importante lembrar que, embora as exceções não verificadas não precisem ser tratadas explicitamente, 
	é sempre uma boa prática tratá-las adequadamente em seu código, a fim de garantir a robustez e a confiabilidade do programa.
	
	=================================================================================================================================
	
##//Lançamento de exceção

	O lançamento de exceção em Java é uma técnica usada para sinalizar que ocorreu um erro ou uma condição excepcional durante a execução do programa. 
	Quando uma exceção é lançada, o fluxo normal de execução do programa é interrompido e a execução é transferida para um bloco de código responsável 
	por lidar com essa exceção.
	Em Java, é possível lançar uma exceção usando a palavra-chave throw, 
	seguida de uma instância da classe de exceção apropriada. Por exemplo:
		
		*public class ExemploLancamentoExcecao {*
		public static void main(String[] args) {
			int idade = -10;
			if (idade < 0) {
				throw new IllegalArgumentException("Idade não pode ser negativa");
			}
		}
	}

	Neste exemplo, estamos verificando se a idade é menor que zero. 
	Se for, lançamos uma exceção IllegalArgumentException usando a palavra-chave throw. 
	A mensagem de erro associada a essa exceção é "Idade não pode ser negativa".
	
	===================================================================================================
	
##//Bloco finally

	O bloco finally em Java é usado em conjunto com os blocos try-catch para garantir que determinado código seja executado, 
	independentemente de ocorrer ou não uma exceção. O código colocado dentro do bloco finally será sempre executado, 
	mesmo que ocorra uma exceção dentro do bloco try ou do bloco catch.
	O bloco finally é útil para garantir que recursos sejam liberados, como fechar um arquivo aberto, 
	encerrar uma conexão com um banco de dados, ou liberar outros recursos utilizados pelo programa.
	
	*EXEMPLO DO BLOCO FINALLY -->* 
	
			import java.io.File;
		import java.io.FileReader;
		import java.io.FileNotFoundException;
		import java.io.IOException;

		public class ExemploBlocoFinally {
			public static void main(String[] args) {
				FileReader leitor = null;
				try {
					File arquivo = new File("arquivo.txt");
					leitor = new FileReader(arquivo);
					// Ler arquivo...
				} catch (FileNotFoundException e) {
					System.out.println("Arquivo não encontrado: " + e.getMessage());
				} catch (IOException e) {
					System.out.println("Erro ao ler arquivo: " + e.getMessage());
				} finally {
					if (leitor != null) {
						try {
							leitor.close();
						} catch (IOException e) {
							System.out.println("Erro ao fechar arquivo: " + e.getMessage());
						}
					}
				}
			}
		}

	Neste exemplo, estamos lendo um arquivo e tratando as exceções que podem ocorrer usando blocos try-catch. 
	Independentemente de ocorrer ou não uma exceção, o bloco finally será executado e garantirá que o objeto FileReader seja fechado 
	corretamente para evitar vazamentos de recursos. Se ocorrer um erro ao fechar o arquivo, ele será tratado dentro do bloco finally.
	
	==========================================================================================================
	
##// Pilha de exceções

	A pilha de exceções em Java é uma estrutura de dados que mantém o registro das chamadas de método que levaram à ocorrência de uma exceção. 
	uando uma exceção é lançada, a pilha de exceções é preenchida com informações sobre o método atual e os métodos que o chamaram, 
	criando uma sequência de chamadas de método que levaram à exceção.
	A pilha de exceções é útil para depurar problemas no código, 
	pois fornece informações valiosas sobre o contexto em que a exceção ocorreu. 
	Ao examinar a pilha de exceções, é possível determinar exatamente qual método levou à exceção e como os métodos chamados contribuíram 
	para a ocorrência do erro.
	
	EXEMPLO DE PILHA DE EXCEÇOES -->
	
	Exception in thread "main" java.lang.NullPointerException
    at com.example.MyClass.myMethod(MyClass.java:10)
    at com.example.MyClass.main(MyClass.java:5)

	Neste exemplo, ocorreu uma exceção do tipo NullPointerException no método myMethod da classe MyClass. 
	A pilha de exceções indica que o método myMethod foi chamado pela classe MyClass no número da linha 5, e que o erro ocorreu na linha 10 do método myMethod.

=========================================================================================================================

##//Múltiplos blocos catch

		Em Java, é possível utilizar múltiplos blocos catch para tratar diferentes tipos de exceções que podem ocorrer em um trecho de código. 
		Cada bloco catch pode capturar uma exceção específica e executar um bloco de código correspondente.
		A ordem dos blocos catch é importante, pois o primeiro bloco que corresponde ao tipo de exceção lançada é o que será executado. 
		Se uma exceção lançada corresponder a vários blocos catch, apenas o primeiro bloco correspondente será executado.
		
		EXEMPLO DE BLOCO CATCH
		
			public class ExemploMultiplosCatch {
		public static void main(String[] args) {
			try {
				int resultado = 10 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Erro de divisão por zero: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Erro genérico: " + e.getMessage());
			}
		}
	}
	
	Neste exemplo, estamos tentando dividir o número 10 por zero, o que resultaria em uma exceção do tipo ArithmeticException. 
	Utilizamos dois blocos catch para tratar as exceções que podem ocorrer. 
	O primeiro bloco captura a exceção ArithmeticException e imprime uma mensagem específica para esse tipo de exceção. 
	O segundo bloco captura todas as outras exceções que não correspondem ao primeiro bloco e imprime uma mensagem genérica.
===============================================================================================================================
		

	
	
	

	
	




		

			


				