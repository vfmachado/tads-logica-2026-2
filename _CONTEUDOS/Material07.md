# 07

# Estrutura de Selecao `switch-case` em Java

## Introducao
Nesta aula, vamos aprender a estrutura `switch-case`, utilizada para escolher uma acao entre varias possibilidades. Ela e especialmente adequada quando uma mesma variavel pode assumir valores fixos, como opcoes de um menu, dias da semana ou categorias.

## 1. Estrutura basica
A estrutura `switch` compara uma expressao com diferentes valores definidos em `case`.

```java
switch (expressao) {
    case valor1:
        // codigo executado quando expressao for igual a valor1
        break;
    case valor2:
        // codigo executado quando expressao for igual a valor2
        break;
    default:
        // codigo executado quando nenhum case corresponder
}
```

O `switch` verifica a expressao e procura um `case` com valor correspondente. O `break` encerra o `switch` depois da execucao do caso encontrado. O `default` e opcional e representa a situacao em que nenhum caso corresponde.

## 2. Exemplo com numeros
O exemplo abaixo interpreta uma opcao escolhida pelo usuario:

```java
int opcao = 2;

switch (opcao) {
    case 1:
        System.out.println("Cadastrar produto");
        break;
    case 2:
        System.out.println("Listar produtos");
        break;
    case 3:
        System.out.println("Sair");
        break;
    default:
        System.out.println("Opcao invalida");
}
```

Como o valor de `opcao` e `2`, o programa exibe `Listar produtos`. Depois do `break`, a execucao continua apos o `switch`.

## 3. O comando `break`
O `break` impede que o programa continue executando os `case` seguintes. Quando um `case` corresponde e nao possui `break`, ocorre o chamado *fall-through*: o Java continua executando os proximos casos.

```java
int numero = 1;

switch (numero) {
    case 1:
        System.out.println("Um");
    case 2:
        System.out.println("Dois");
        break;
    default:
        System.out.println("Outro numero");
}
```

Nesse exemplo, ao encontrar o `case 1`, o Java exibe `Um` e continua para o `case 2`, exibindo tambem `Dois`. Na maioria das situacoes, esquecer o `break` e um erro. Quando a queda entre casos for intencional, ela deve ser usada com cuidado.

## 4. Usando `default`
O bloco `default` trata valores que nao foram previstos nos `case`.

```java
char tamanho = 'X';

switch (tamanho) {
    case 'P':
        System.out.println("Pequeno");
        break;
    case 'M':
        System.out.println("Medio");
        break;
    case 'G':
        System.out.println("Grande");
        break;
    default:
        System.out.println("Tamanho invalido");
}
```

Como `X` nao aparece em nenhum `case`, o bloco `default` sera executado.

## 5. Varios `case` para a mesma acao
Podemos agrupar casos quando diferentes valores devem produzir o mesmo resultado.

```java
int dia = 6;

switch (dia) {
    case 1:
    case 7:
        System.out.println("Fim de semana");
        break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
        System.out.println("Dia de semana");
        break;
    default:
        System.out.println("Dia invalido");
}
```

Os casos `1` e `7` compartilham a mesma acao. O mesmo acontece com os casos de `2` a `6`.

## 6. `switch` com `String`
O `switch` tambem pode comparar textos do tipo `String`.

```java
String comando = "salvar";

switch (comando) {
    case "novo":
        System.out.println("Criando um novo arquivo");
        break;
    case "salvar":
        System.out.println("Salvando o arquivo");
        break;
    case "sair":
        System.out.println("Encerrando o programa");
        break;
    default:
        System.out.println("Comando desconhecido");
}
```

Os valores dos textos precisam corresponder exatamente, incluindo letras maiusculas e minusculas. Por exemplo, `"salvar"` e `"Salvar"` sao valores diferentes.

## 7. `switch` com entrada do usuario
Podemos combinar `switch` com `Scanner` para criar um menu simples.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.println("1 - Somar");
System.out.println("2 - Subtrair");
System.out.println("3 - Multiplicar");
System.out.print("Escolha uma operacao: ");
int opcao = scanner.nextInt();

switch (opcao) {
    case 1:
        System.out.println("Operacao de soma");
        break;
    case 2:
        System.out.println("Operacao de subtracao");
        break;
    case 3:
        System.out.println("Operacao de multiplicacao");
        break;
    default:
        System.out.println("Opcao invalida");
}

scanner.close();
```

A estrutura `switch` seleciona a mensagem correspondente a opcao digitada.

## 8. `switch` tradicional e `switch` moderno
Em versoes atuais do Java, tambem podemos usar a forma de expressao `switch`, que retorna um valor. Nessa forma, usamos `->` e nao precisamos escrever `break`.

```java
int opcao = 2;

String mensagem = switch (opcao) {
    case 1 -> "Opcao um";
    case 2 -> "Opcao dois";
    case 3 -> "Opcao tres";
    default -> "Opcao invalida";
};

System.out.println(mensagem);
```

A forma tradicional continua sendo importante para compreender exemplos e projetos que utilizam versoes mais antigas do Java. A forma moderna costuma ser mais curta e reduz o risco de esquecer o `break`.

## 9. Quando usar `switch` ou `if-else`
Use `switch` quando estiver comparando uma mesma expressao com varios valores fixos.

```java
switch (nota) {
    case 10:
        System.out.println("Nota maxima");
        break;
    default:
        System.out.println("Outra nota");
}
```

Use `if-else` quando precisar testar intervalos ou condicoes mais complexas.

```java
if (nota >= 7) {
    System.out.println("Aprovado");
} else {
    System.out.println("Reprovado");
}
```

O `switch` nao substitui todas as condicoes. Para verificar se um valor esta dentro de um intervalo, por exemplo, o `if-else` normalmente e mais adequado.

## Conclusao
A estrutura `switch-case` organiza decisoes baseadas em valores fixos. Os comandos `case`, `break` e `default` formam a estrutura tradicional, enquanto a forma moderna com `->` pode deixar o codigo mais direto. Escolha `switch` para varias opcoes bem definidas e `if-else` para intervalos ou condicoes mais elaboradas.
