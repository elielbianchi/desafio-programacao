public class TesteMediana {
    public static void main(String[] args) {
        int[] lista1 = {9,1,3,18,11,22,7};
        int[] lista2 = {9,2,1,4,6};
        int[] lista3 = {2,7,10,1,15,9,5,5,12};
        int esperado1 = 9;
        int esperado2 = 4;
        int esperado3 = 7;
        Mediana mediana1 = new Mediana(lista1);
        Mediana mediana2 = new Mediana(lista2);
        Mediana mediana3 = new Mediana(lista3);
        int resultado1 = mediana1.calculaMediana();
        int resultado2 = mediana2.calculaMediana();
        int resultado3 = mediana3.calculaMediana();
        System.out.println("Teste do exercício 1: Mediana");
        System.out.println("Teste 1:");
        System.out.println(testarNumero(resultado1, esperado1));
        System.out.println("Teste 2:");
        System.out.println(testarNumero(resultado2, esperado2));
        System.out.println("Teste 3:");
        System.out.println(testarNumero(resultado3, esperado3));
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

