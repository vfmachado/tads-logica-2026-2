# Ambiente de Desenvolvimento Java

Para programar em Java, é preciso entender algumas peças que trabalham juntas: **JDK**, **JRE**, **compilador**, **IDE** e o **código-fonte**.

## Código-fonte

É o texto que nós, programadores, escrevemos, seguindo as regras da linguagem Java. Fica salvo em arquivos com extensão `.java` (ex: `Teste.java`). O computador **não entende** esse texto diretamente — ele precisa ser traduzido antes de ser executado.

## Compilador (javac)

É o programa que traduz o código-fonte (`.java`) para **bytecode** (`.class`), uma linguagem intermediária que a JVM consegue executar. No terminal, o comando usado é:

```
javac Teste.java
```

Esse comando gera o arquivo `Teste.class`.

## JVM (Java Virtual Machine)

É a "máquina virtual" que executa o bytecode. É graças a ela que um programa Java compilado em um sistema (Windows, Linux, Mac) roda em qualquer outro sem precisar recompilar — daí o lema **"escreva uma vez, rode em qualquer lugar"**.

## JRE (Java Runtime Environment)

É o ambiente necessário para **executar** programas Java. Contém a JVM + as bibliotecas padrão do Java. Se você só quer rodar um programa Java já pronto, o JRE é suficiente.

## JDK (Java Development Kit)

É o kit necessário para **desenvolver** programas Java. Contém o JRE (para executar) + o compilador `javac` + outras ferramentas de desenvolvimento. Se você quer **escrever e compilar** código Java, precisa do JDK instalado.

```
JDK
 ├── javac (compilador)
 └── JRE
      ├── JVM (executa o bytecode)
      └── Bibliotecas padrão (java.lang, java.util, etc.)
```

## IDE (Integrated Development Environment)

É o programa/editor que facilita a escrita de código: destaca erros, sugere autocompletar, organiza arquivos, compila e executa com um clique, etc. Exemplos: **VS Code**, IntelliJ IDEA, Eclipse. A IDE não substitui o JDK — ela apenas usa o JDK por trás dos panos.

## Passo a passo para rodar um programa Java

1. **Instalar o JDK** no computador (veja `Instalacao.md`).
2. **Escrever o código-fonte** em um arquivo `.java` (ex: `Teste.java`), usando a IDE (ex: VS Code).
3. **Compilar** o código-fonte para gerar o bytecode:
   ```
   javac Teste.java
   ```
   Isso cria o arquivo `Teste.class`.
4. **Executar** o bytecode na JVM:
   ```
   java Teste
   ```
5. O resultado do programa aparece no terminal.

```
Teste.java  --(javac)-->  Teste.class  --(java / JVM)-->  Saída no terminal
```

---

# Classe Scanner

A classe `Scanner` é usada em Java para **ler dados digitados pelo usuário** no teclado (entrada de dados via terminal). Ela fica no pacote `java.util`, por isso precisa ser importada no início do arquivo.

## Passos básicos para usar o Scanner

1. Importar a classe:
   ```java
   import java.util.Scanner;
   ```
2. Criar um objeto Scanner associado à entrada padrão (`System.in`):
   ```java
   Scanner sc = new Scanner(System.in);
   ```
3. Usar o método correspondente ao tipo de dado que se quer ler.

## Lendo diferentes tipos de dados

| Tipo    | Método do Scanner | Exemplo de uso            |
|---------|--------------------|----------------------------|
| int     | `nextInt()`        | número inteiro (ex: 10)    |
| float   | `nextFloat()`      | número decimal (ex: 3.5f)  |
| double  | `nextDouble()`     | número decimal (ex: 3.5)   |
| String  | `nextLine()`       | texto/linha inteira        |

## Exemplo completo

```java
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade (int): ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura em metros (float): ");
        float altura = sc.nextFloat();

        System.out.print("Digite seu salário (double): ");
        double salario = sc.nextDouble();

        System.out.println("\n--- Resumo ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);

        sc.close();
    }
}
```

## Cuidado: mistura de `nextLine()` com `nextInt()`/`nextFloat()`/`nextDouble()`

Os métodos `nextInt()`, `nextFloat()` e `nextDouble()` leem apenas o número digitado, mas **deixam a quebra de linha (Enter) no buffer**. Se depois disso for chamado `nextLine()`, ele vai ler essa quebra de linha "vazia" em vez de esperar uma nova entrada do usuário.

**Solução:** adicionar um `sc.nextLine()` extra logo após ler um número, para "limpar" o Enter que ficou pendente:

```java
int idade = sc.nextInt();
sc.nextLine(); // limpa o Enter pendente

System.out.print("Digite seu nome: ");
String nome = sc.nextLine(); // agora funciona corretamente
```

## Boa prática

Sempre feche o Scanner ao final do programa, para liberar o recurso de entrada:

```java
sc.close();
```

Como nossos códigos são simples e curtos, não é um problema, mas em programas maiores é uma boa prática pois o Scanner mantém recursos do sistema ocupados.