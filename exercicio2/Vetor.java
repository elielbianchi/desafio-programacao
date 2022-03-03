public class Vetor {
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
