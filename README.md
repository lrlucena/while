While
=====

Linguagem "Enquanto" usada como exemplo na disciplina de Paradigmas de Linguagens de Programação

> Implementação da linguagem em Scala (~250 linhas de código): [whilelang](http://github.com/lrlucena/whilelang)

## Sintaxe

A gramática está definida em [Enquanto.g4](https://github.com/lrlucena/While/blob/master/src/plp/enquanto/parser/Enquanto.g4)

### Exemplo

<pre lang="Scala">
a := leia;
b := 10;
se a <= b entao
  exiba "Menor"
senao
  exiba "Maior"
</pre>

## Projeto de Paradigmas de Linguagens de Programação

### Tarefas:
1. Inclua a operação de divisão de inteiros (`/`)
2. Inclua a operação de exponenciação de inteiros (`^`)
3. Inclua as operações `ou` e `xor` entre booleanos
4. Inclua as relações menor (`<`), maior (`>`), maior ou igual (`>=`) e diferente (`<>`) entre inteiros
5. Altere a sintaxe para que o `;` ao invés de separar comandos seja usado para finalizar cada comando  
6. Crie o comando `para ID de expressao ate expressao [passo Int] faca comando`. Exemplo
<pre lang="scala">
    para i de 1 ate 5 passo 2 faca
      escreva i
</pre>

7. Altere o comando `se .. entao .. senao ...` para incluir a cláusula (opcional) `senaose`. Cada `se` pode ter zero ou mais clausulas `senaose`. Exemplo:
<pre lang="scala">
    se nota >= 6 entao
      exiba "Aprovado"
    senaose nota >= 3 entao
      exiba "Recuperação"
    senao
      exiba "Reprovado"
</pre>

8. Crie o comando `escolha` (switch).
<pre lang="scala">
    x = leia
    escolha x
      caso 1 : exiba "um"
      caso 2 : exiba "dois"
      outro  : exiba "outro numero"
</pre>

9. Altere a linguagem para permitir atribuições paralelas:
<pre lang="scala">
    a, b, c := 2, 3, 4
    a, b := b, a
</pre>
  
10. Inclua a definição e aplicação de funções
<pre lang="scala">
  soma = (a, b) => a + b
  
  soma(2,3)
</pre>
