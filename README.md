# Exercício proposto (Map)

Na contagem de votos de uma eleição, são gerados vários registros
de votação contendo o nome do candidato e a quantidade de votos
(formato .csv) que ele obteve em uma urna de votação. Você deve
fazer um programa para ler os registros de votação a partir de um
arquivo, e daí gerar um relatório consolidado com os totais de cada
candidato.

**Input file example:**

```
Alex Blue,15
Maria Green,22
Bob Brown,21
Alex Blue,30
Bob Brown,15
Maria Green,27
Maria Green,22
Bob Brown,25
Alex Blue,31
```

**Execution:**

```
Enter file full path: in.txt
Alex Blue: 76
Maria Green: 71
Bob Brown: 61
```


#### TreeMap

**Vantagens:** 
- Ordenação Automática: As chaves são automaticamente ordenadas em ordem natural (alfabética para strings). 
Isso é útil se você deseja que os resultados sejam exibidos em ordem alfabética.
- Operações Eficientes: As operações de pesquisa, inserção e remoção têm complexidade de tempo O(log n) devido 
à estrutura de árvore balanceada.

**Desvantagens:**
- Desempenho: Um pouco mais lento em comparação com HashMap e LinkedHashMap para operações de inserção e acesso, devido 
à necessidade de manter a ordem.
- Sobrecarga de Memória: Pode ter uma sobrecarga de memória maior devido à estrutura de árvore.

#### LinkedHashMap

**Vantagens:**
- Manutenção da Ordem de Inserção: Os elementos são iterados na ordem em que foram inseridos. 
- Isso é útil se você deseja preservar a sequência original dos dados.
- Desempenho: Geralmente mais rápido que TreeMap para inserção e acesso, com tempo médio O(1) para essas operações.

**Desvantagens:**
- Sem Ordenação Automática: Não mantém os elementos em ordem alfabética ou qualquer outra ordem se você não os inserir nessa ordem.
- Slightly More Memory: Tem um overhead de memória ligeiramente maior que HashMap, mas geralmente é menor que o de TreeMap.


##### Melhor Escolha

    * Se a Ordenação Alfabética for Necessária:
Use TreeMap. Ele garante que os resultados sejam exibidos em ordem alfabética, o que pode ser mais legível e intuitivo 
em um relatório.

    * Se a Ordem de Inserção for Importante:
Use LinkedHashMap. Isso é útil se você quiser que os resultados sejam exibidos na ordem em que os candidatos foram lidos do arquivo, mantendo a sequência original.

    * Se a Performance for Crucial:
Em casos onde a performance é uma preocupação e você não precisa de ordenação, HashMap é a melhor escolha, pois tem o desempenho mais rápido para operações de inserção e acesso.
