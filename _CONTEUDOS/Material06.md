# 06

# Estruturas de Repeticao e Controle de Fluxo em Java

## Introducao
Nesta aula, vamos aprender a estrutura de repeticao `for`, a estrutura `do-while` e os comandos `break` e `continue`. Essas ferramentas permitem repetir blocos de codigo, controlar a quantidade de repeticoes e alterar o fluxo normal de um laco.

## 1. Estrutura `for`
A estrutura `for` e indicada quando sabemos, ou conseguimos definir, quantas vezes uma repeticao deve acontecer. Ela reune a inicializacao, a condicao e a atualizacao da variavel de controle em uma unica linha.

```java
for (inicializacao; condicao; atualizacao) {
    // codigo que sera repetido
}
```

A execucao acontece nesta ordem:

1. A inicializacao e executada uma vez.
2. A condicao e verificada.
3. Se a condicao for verdadeira, o bloco e executado.
4. A atualizacao e executada.
5. A condicao e verificada novamente.

## 2. Exemplo basico com `for`
O exemplo abaixo imprime os numeros de 1 a 5:

```java
for (int numero = 1; numero <= 5; numero++) {
    System.out.println(numero);
}
```

A variavel `numero` comeca em `1`. Depois de cada repeticao, ela e incrementada com `numero++`. Quando chega a `6`, a condicao `numero <= 5` se torna falsa e o laco termina.

## 3. Contagem crescente e decrescente
O `for` pode ser usado tanto para aumentar quanto para diminuir uma variavel.

```java
for (int numero = 0; numero <= 10; numero += 2) {
    System.out.println(numero);
}

for (int numero = 5; numero >= 1; numero--) {
    System.out.println(numero);
}
```

No primeiro laco, sao exibidos os numeros pares de `0` a `10`. No segundo, os numeros sao exibidos em ordem decrescente.

## 4. `for` com acumulador
Um acumulador armazena um resultado que e atualizado a cada repeticao.

```java
int soma = 0;

for (int numero = 1; numero <= 5; numero++) {
    soma += numero;
}

System.out.println("Soma: " + soma);
```

Nesse exemplo, o valor de `soma` recebe os numeros de 1 a 5. Ao final, o resultado exibido sera `15`.

## 5. Estrutura `do-while`
A estrutura `do-while` executa o bloco de codigo pelo menos uma vez. A condicao e verificada somente depois da primeira execucao.

```java
do {
    // codigo que sera executado
} while (condicao);
```

Observe que existe um ponto e virgula depois da condicao do `while`.

```java
int numero = 10;

do {
    System.out.println("O bloco foi executado.");
} while (numero < 5);
```

Mesmo que `numero < 5` seja falsa, a mensagem sera exibida uma vez.

## 6. Diferenca entre `while` e `do-while`
No `while`, a condicao e verificada antes da execucao. O bloco pode nao ser executado nenhuma vez.

```java
int numero = 10;

while (numero < 5) {
    System.out.println("Esta mensagem nao sera exibida.");
}
```

No `do-while`, o bloco e executado antes da verificacao. Por isso, ele sempre executa pelo menos uma vez.

Uma situacao comum para usar `do-while` e a exibicao de um menu que deve aparecer antes de a opcao do usuario ser verificada:

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int opcao;

do {
    System.out.println("1 - Continuar");
    System.out.println("0 - Sair");
    System.out.print("Escolha uma opcao: ");
    opcao = scanner.nextInt();
} while (opcao != 0);

System.out.println("Programa encerrado.");
scanner.close();
```

## 7. Comando `break`
O comando `break` interrompe imediatamente o laco em que esta sendo executado. Depois dele, o programa continua na primeira instrucao apos o laco.

```java
for (int numero = 1; numero <= 10; numero++) {
    if (numero == 6) {
        break;
    }

    System.out.println(numero);
}
```

Nesse caso, os numeros de 1 a 5 sao exibidos. Quando `numero` chega a `6`, o `break` encerra o `for`.

O `break` e util quando encontramos o resultado que procuravamos e nao precisamos continuar verificando os demais valores.

## 8. Comando `continue`
O comando `continue` interrompe apenas a repeticao atual e passa para a proxima repeticao do laco.

```java
for (int numero = 1; numero <= 5; numero++) {
    if (numero == 3) {
        continue;
    }

    System.out.println(numero);
}
```

O resultado sera `1`, `2`, `4` e `5`. Quando `numero` vale `3`, o `continue` ignora o restante do bloco e inicia a proxima repeticao.

## 9. `break` e `continue` com `while`
Esses comandos tambem podem ser usados em estruturas `while` e `do-while`.

```java
int numero = 0;

while (numero < 10) {
    numero++;

    if (numero % 2 == 0) {
        continue;
    }

    if (numero > 7) {
        break;
    }

    System.out.println(numero);
}
```

Nesse exemplo, os numeros pares sao ignorados pelo `continue`. Quando o numero ultrapassa `7`, o `break` encerra o laco.

## 10. Cuidados no uso de `break` e `continue`
- Use `break` quando for necessario encerrar o laco antes da condicao normal.
- Use `continue` quando a repeticao atual nao precisar terminar o restante do bloco.
- Em um `while`, atualize a variavel de controle antes de usar `continue`, quando necessario, para evitar um loop infinito.
- Evite usar muitos desvios no mesmo laco, pois isso pode dificultar a leitura do programa.

## Conclusao
A estrutura `for` facilita a criacao de repeticoes controladas por uma variavel. A estrutura `do-while` garante que o bloco seja executado pelo menos uma vez. Os comandos `break` e `continue` permitem interromper um laco ou pular a repeticao atual. Com essas ferramentas, podemos construir programas com repeticoes mais organizadas e flexiveis.
