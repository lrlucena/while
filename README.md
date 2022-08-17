While
=====

Linguagem "Enquanto" usada como exemplo na disciplina de Paradigmas de Linguagens de Programação

> Implementação da linguagem em Scala (~250 linhas de código): [whilelang](http://github.com/lrlucena/whilelang)

## Sintaxe

A gramática está definida em [Enquanto.g4](https://github.com/lrlucena/While/blob/master/src/plp/enquanto/parser/Enquanto.g4)

### Exemplo

<pre lang="portugol">
a := leia;
b := 10;
se a <= b entao
  exiba "Menor"
senao
  exiba "Maior"
</pre>

## Compilação e Execução

Este projeto usa alguns recursos da versão 14 de Java. Por isso é necessário verificar a versão instalada e, se for necessário, atualizar a versão.

````bash
$ java -version
````

Se a versão de Java for anterior à versão 14  então é preciso atualizar a versão instalada. Você pode usar o sdkman (sdkman.org) para instalar a versão mais nova.

````bash
$ sdk i java
````

Para compilar use `compilar.bat` (windows) ou `compilar.sh` (linux).

````bash
$ ./compilar.sh
````
O script gera o parser e compila o código Java gerado.

Para executar use `while.bat` (windows) ou `./while` (linux).

````bash
$ ./while olamundo.while
````

## Projeto de Paradigmas de Linguagens de Programação

### Tarefas:
1. Inclua a operações de divisão (`/`) e de exponenciação de inteiros (`^`)
2. Inclua as operações `ou` e `xor` entre booleanos
3. Inclua as relações menor (`<`), maior (`>`), maior ou igual (`>=`) e diferente (`!=`) entre inteiros
4. Altere a sintaxe para que o `;` ao invés de separar comandos seja usado para finalizar cada comando  
5. Crie o comando `para ID em expressao .. expressao faca comando`. Exemplo
<pre lang="portugol">
    para i em 1 .. 5 faca
      escreva i
</pre>
6. Crie o comando `repita expressao vezes comando`. Exemplo
<pre lang="portugol">
    repita 10 vezes
      exiba "Funciona"
</pre>
7. Altere o comando `se .. entao .. senao ...` para incluir a cláusula (opcional) `senaose`. Cada `se` pode ter zero ou mais clausulas `senaose`. Exemplo:
<pre lang="portugol">
    se nota >= 6 entao
      exiba "Aprovado"
    senaose nota >= 3 entao
      exiba "Recuperação"
    senao
      exiba "Reprovado"
</pre>

8. Crie o comando `quando` (switch).
<pre lang="portugol">
    x = leia
    quando x
      1 : exiba "um"
      2 : exiba "dois"
      _ : exiba "outro numero"
</pre>

9. Altere a linguagem para permitir atribuições paralelas:
<pre lang="portugol">
    a, b, c := 2, 3, 4
    a, b := b, a
</pre>
  
10. Altere a linguagem para unificar os comandos `exiba` e `escreva`.
<pre lang="portugol">
  exiba "Ola Mundo"
  exiba 2021
</pre>
