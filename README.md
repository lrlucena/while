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
5. O comando `para ID de expressao ate expressao [passo Int] faca comando`. Exemplo
<pre>
    para i de 1 ate 5 passo 2 faca
      escreva i
</pre>
8. A alteração do comando `se .. entao .. senao ...` para incluir a cláusula (opcional) `senaose`. Cada `se` pode ter zero ou mais clausulas `senaose`. Exemplo:
<pre>
    se nota > 6 entao
      exiba "Aprovado"
    senaose nota > 3 entao
      exiba "Recuperação"
    senao
      exiba "Reprovado"
</pre>

9. O comando `escolha` (switch).
<pre>
    x = leia
    escolha x
      caso 1 : exiba "um"
      caso 2 : exiba "dois"
      outro  : exiba "outro numero"
 </pre>

10. A definição e aplicação de funções
<pre>
  soma(a,b) = a + b ;
  
  soma(2,3)
</pre>
