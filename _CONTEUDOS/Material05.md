# 05

# Estrutura de Repetição `while` em Java

## Introdução
Nesta aula, vamos aprender sobre a estrutura de repetição `while` em Java. Ela permite repetir um bloco de código enquanto uma condição for verdadeira. Os laços de repetição são úteis quando precisamos executar uma tarefa várias vezes sem escrever o mesmo código repetidamente.

## 1. Estrutura `while`
A estrutura `while` verifica uma condição antes de executar o bloco de código. Enquanto a condição for verdadeira, o bloco será executado novamente.

```java
while (condicao) {
    // código que será repetido
}
```

A condição deve produzir um valor booleano, ou seja, `true` ou `false`.

## 2. Exemplo básico
O exemplo abaixo imprime os números de 1 a 5:

```java
int numero = 1;

while (numero <= 5) {
    System.out.println(numero);
    numero++;
}
```

A variável `numero` começa com o valor `1`. A cada repetição, o valor é exibido e incrementado em uma unidade. Quando `numero` passa a ser `6`, a condição `numero <= 5` se torna falsa e o laço termina.

## 3. Contador e atualização da variável
Para evitar que o laço seja executado indefinidamente, é importante atualizar dentro do `while` a variável utilizada na condição.

```java
int contador = 0;

while (contador < 3) {
    System.out.println("Repetição: " + contador);
    contador++;
}
```

Se a variável `contador` não fosse alterada, a condição continuaria verdadeira e o programa entraria em um loop infinito.

## 4. Leitura de dados com `while`
O `while` também pode ser usado para repetir uma ação até que o usuário informe um valor específico.

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número positivo: ");
int numero = scanner.nextInt();

while (numero <= 0) {
    System.out.print("Valor inválido. Digite um número positivo: ");
    numero = scanner.nextInt();
}

System.out.println("Número informado: " + numero);

scanner.close();
```

Nesse exemplo, o programa continua solicitando um número enquanto o valor informado for menor ou igual a zero. Quando o usuário digita um número positivo, a condição se torna falsa e o laço termina.

## 5. `while` com operadores lógicos
A condição do `while` pode combinar diferentes expressões usando operadores lógicos.

```java
int numero = 1;

while (numero <= 10 && numero % 2 != 0) {
    System.out.println(numero);
    numero += 2;
}
```

Nesse caso, o laço continua enquanto o número for menor ou igual a `10` e for ímpar. O operador `&&` exige que as duas condições sejam verdadeiras.

## 6. Diferença entre `while` e `do-while`
No `while`, a condição é verificada antes da primeira execução. Por isso, o bloco pode não ser executado nenhuma vez.

```java
int numero = 10;

while (numero < 5) {
    System.out.println("Este texto não será exibido.");
}
```

Já no `do-while`, o bloco é executado pelo menos uma vez, pois a condição é verificada somente depois da execução.

```java
int numero = 10;

do {
    System.out.println("Este texto será exibido uma vez.");
} while (numero < 5);
```

## 7. Cuidados com o loop infinito
Um loop infinito acontece quando a condição do `while` nunca se torna falsa. Veja um exemplo:

```java
int numero = 1;

while (numero <= 5) {
    System.out.println(numero);
}
```

Nesse código, `numero` nunca é incrementado. Portanto, ele continuará valendo `1` e a condição permanecerá verdadeira. Para corrigir o problema, devemos atualizar a variável dentro do laço:

```java
int numero = 1;

while (numero <= 5) {
    System.out.println(numero);
    numero++;
}
```

## Conclusão
A estrutura `while` permite repetir um bloco de código enquanto uma condição for verdadeira. Para utilizá-la corretamente, devemos definir uma condição, atualizar as variáveis envolvidas e garantir que o laço possa terminar. O `while` é bastante útil para contadores, validação de dados e situações em que não sabemos antecipadamente quantas repetições serão necessárias.
