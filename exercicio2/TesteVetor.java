package exercicio2;

public class TesteVetor {
    public static void main(String[] args) {
        
        // Bloco de entrada para testes, alterar aqui para testar novas combinações
        int[] vetor1 = {1,5,2,8,11,7,3};
        int esperado1 = 3;
        int[] vetor2 = {1,5,3,4,2};
        int esperado2 = 2;
        int[] vetor3 = {2,7,10,1,11,9,5,3,12};
        int esperado3 = 1;
        
        // Execução do teste, não modificar aqui
        Vetor vetorA = new Vetor(vetor1, esperado1);
        Vetor vetorB = new Vetor(vetor2, esperado2);
        Vetor vetorC = new Vetor(vetor3, esperado3);
        System.out.println("Teste do exercício 2: Número de elementos no vetor com diferença");
        System.out.println("Teste 1:");
        System.out.println(testarNumero(vetorA.numeroParesElementos(), 3));
        System.out.println("Teste 2:");
        System.out.println(testarNumero(vetorB.numeroParesElementos(), 3));
        System.out.println("Teste 3:");
        System.out.println(testarNumero(vetorC.numeroParesElementos(), 5));
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