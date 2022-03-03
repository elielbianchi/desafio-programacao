package exercicio2;

public class Vetor {
    /**
     * Esta classe recebe um vetor de inteiros e um número inteiro. O algoritmo então
     * determina os pares de inteiros no vetor que possuem uma diferença igual ao
     * número passado. Para utilizar esta classe, é necessário criar uma instância desta 
     * classe passando como parâmetros o array do vetor de inteiros e o número inteiro e 
     * então utilizar o método numeroParesInteiros. Este método, retorna o número de pares 
     * de inteiros com a diferença informada.
     */

    private int diferenca;
    private int[] vetor;
    private int tamanhoVetor;
    private int numeroElementos;

    public Vetor(int[] vetor, int diferenca) {
        this.vetor = vetor;
        this.diferenca = diferenca;
        tamanhoVetor = vetor.length;
        numeroElementos = 0;
    }

    public int numeroParesElementos() {
        procuraElementos();
        return numeroElementos;
    }

    private void procuraElementos() {
        for(int i = 0; i < tamanhoVetor-1; i++) {

            for(int j = i+1; j < tamanhoVetor; j++) {

                if(Math.abs(vetor[i] - vetor[j]) == diferenca) {
                    numeroElementos++;
                }
            }
        }
    }
}
