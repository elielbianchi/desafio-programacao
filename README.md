# desafio-programacao

## Este repositório contém os algoritmos desenvolvidos para o desafio de programação do processo seletivo para a Academia Capgemini 2022.
Os arquivos estão separados pelo número de cada exercício, contendo a solução para o desafio e o arquivo de teste unitário do mesmo.

### Índice
<!--ts-->
   * [Índice](#índice)
   * [Instalação](#instalação)
   * [Pré-requisitos](#pre-requisitos)
   * [Como usar](#como-usar)
   * [Tecnologias](#tecnologias)
   * [Autor](#autor)
<!--te-->

### Instalação

Baixe o repósito desafio-programacao para a sua máquina, descompactando e mantendo a estrutura interna dos arquivos.

### Pré-requisitos

Antes de abrir os arquivos, é necessário verificar se o ambiente de desenvolvimento Java SE está instalado na máquina. Deve-se abrir então o 
terminal (Linux e macOS) ou o cmd(Windows) e digitar "javac --version" sem as aspas. Caso não aparecer nenhuma versão já instalada, deve-se
instalar conforme instruções no link citado abaixo no item de tecnologias. Recomenda-se a versão mais atual do Java.

### Como usar

Com o pacote Java SE/JDK instalado propriamente na máquina, deve-se então novamente no terminal(ou cmd) abrir o caminho da pasta e chegar até
a pasta desafio-programacao. 

#### Testes unitários

Para rodar os arquivos de testes unitários, deve-se primeiro realizar a compilação dos arquivos. Para isso, deve-se digitar no terminal o comando javac 
mais o caminho relativo do arquivo. Por exemplo, para compilar o teste do exercício 1 e estando no diretório desafio-programacao, deve-se escrever e executar: 
"javac exercicio1\TesteMediana.java" sem as aspas. Após, utiliza-se o comando java com o mesmo caminho relativo: "java exercicio1\TesteMediana.java". Repete-se
o mesmo para os outros exercicíos e aparecerá no terminal o resultado em caso de sucesso ou falha de cada teste.

#### Reutilizar métodos

Caso queira reutilizar os métodos escritos em outros projetos, deve-se colocar no mesmo pacote os arquivos das classes contendo os algoritmos de solução. São eles:
"exercicio1\Mediana.java", "exercicio2\Vetor.java" e "exercicio3\Encriptacao.java". Então, deve-se criar uma instância para cada classe antes de usá-la passando
os parâmetros necessários conforme a documentação de cada classe. Dentro de cada classe, também estão indicados os métodos que realizam o proposto e retornam o resultado
esperado.

### Tecnologias

Tecnologias utilizadas para resolução destes exercícios:

- [Java SE] (https://www.oracle.com/java/technologies/)
- [Visual Studio Code IDE] (https://code.visualstudio.com/Download)

### Autor

Eliel Bianchi
E-mail: elielbianchi@hotmail.com
LinkedIn: linkedin.com/in/elielbianchi
