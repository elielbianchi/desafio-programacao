package exercicio2;

public class TesteVetor {
    public static void main(String[] args) {
        
        // Bloco de entrada para testes, alterar aqui para testar novas combinações
        int[] vetor1 = {1,5,2,8,11,7,3};
        int diferenca1 = 3;
        int esperado1 = 3;
        int[] vetor2 = {1,5,3,4,2};
        int diferenca2 = 2;
        int esperado2 = 3;
        int[] vetor3 = {2,7,10,1,11,9,5,3,12};
        int diferenca3 = 1;
        int esperado3 = 5;
        
        // Bloco de execução do teste, não modificar aqui
        Vetor vetorA = new Vetor(vetor1, diferenca1);
        Vetor vetorB = new Vetor(vetor2, diferenca2);
        Vetor vetorC = new Vetor(vetor3, diferenca3);
        System.out.println("Teste do exercício 2: Número de elementos no vetor com diferença");
        System.out.println("Teste 1 - Pares de elementos com diferença de " + diferenca1);
        System.out.println(testarNumero(vetorA.numeroParesElementos(), esperado1));
        System.out.println("Teste 2 - Pares de elementos com diferença de " + diferenca2);
        System.out.println(testarNumero(vetorB.numeroParesElementos(), esperado2));
        System.out.println("Teste 3 - Pares de elementos com diferença de " + diferenca3);
        System.out.println(testarNumero(vetorC.numeroParesElementos(), esperado3));
    }

    public static String testarNumero(int resultado, int esperado) {
        if(resultado == esperado) {
            return "Sucesso! Resultado: " + resultado + ". Esperado: " + esperado;
        }
        else {
            return "Falhou! Resultado: " + resultado + ". Esperado: " + esperado;
        }
    }
}