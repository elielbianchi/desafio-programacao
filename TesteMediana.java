public class TesteMediana {
    public static void main(String[] args) {
        int[] lista1 = {9,1,3,18,11,22,7};
        int[] lista2 = {9,2,1,4,6};
        int[] lista3 = {2,7,10,1,15,9,5,5,12};
        Mediana mediana1 = new Mediana(lista1);
        Mediana mediana2 = new Mediana(lista2);
        Mediana mediana3 = new Mediana(lista3);
        System.out.println("Teste do exercício 1: Mediana");
        System.out.println("Teste 1:");
        System.out.println(testarNumero(mediana1.calculaMediana(), 9));
        System.out.println("Teste 2:");
        System.out.println(testarNumero(mediana2.calculaMediana(), 4));
        System.out.println("Teste 3:");
        System.out.println(testarNumero(mediana3.calculaMediana(), 7));
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

