While
=====

Linguagem "Enquanto" usada como exemplo na disciplina de Paradigmas de Linguagens de Programação

> Implementação da linguagem em Scala (~250 linhas de código): [whilelang](http://github.com/lrlucena/whilelang)

## Projeto de Paradigmas de Linguagens de Programação

### Altere a linguagem para incluir:
1. A expressão de divisão de inteiros (`/`)
2. A expressão de exponenciação de inteiros (`^`)
3. A expressão `ou` entre booleanos
4. A expressão `xor` entre booleanos
5. A relação maior ou igual (`>=`)
6. A relação diferente (`<>`)
5. O comando `para ID de expressao ate expressao faca comando`. Exemplo
<pre>
    para i de 1 ate 5 faca
      escreva i
</pre>
6. A alteração do comando `se .. entao .. senao ...` para incluir a cláusula (opcional) `senaose`. Exemplo:
<pre>
    se nota > 6 entao
      exiba "Aprovado"
    senaose nota > 3 entao
      exiba "Recuperação"
    senao
      exiba "Reprovado"
</pre>

### Escreva um artigo (com até 10 páginas) para descrever as alterações realizadas na linguagem. O artigo deve abordar:
1. Linguagens
2. Gramática
3. Parser
4. BNF
5. As alterações realizadas na linguagem original.
