package exercicio1;

public class TesteMediana {
    public static void main(String[] args) {

        /**
         * Classe de teste da classe Mediana. Pode-se rodar este teste toda vez que a classe 
         * citada for alterada, para confirmar que continua funcionando. Os parâmetros
         * do bloco abaixo podem ser alterados para modificar os testes. 
         */

        // Bloco de entrada para testes, alterar aqui para testar novas combinações
        int[] lista1 = {9,1,3,18,11,22,7};
        int esperado1 = 9;
        int[] lista2 = {9,2,1,4,6};
        int esperado2 = 4;
        int[] lista3 = {2,7,10,1,15,9,5,5,12};
        int esperado3 = 7;

        // Bloco de execução do teste, não modificar aqui
        Mediana mediana1 = new Mediana(lista1);
        Mediana mediana2 = new Mediana(lista2);
        Mediana mediana3 = new Mediana(lista3);
        System.out.println("Teste do exercício 1: Mediana");
        System.out.println("Teste 1 - Primeira lista:");
        System.out.println(testarNumero(mediana1.calcularMediana(), esperado1));
        System.out.println("Teste 2 - Segunda lista:");
        System.out.println(testarNumero(mediana2.calcularMediana(), esperado2));
        System.out.println("Teste 3: Terceira lista:");
        System.out.println(testarNumero(mediana3.calcularMediana(), esperado3));
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

