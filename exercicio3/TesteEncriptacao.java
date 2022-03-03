package exercicio3;

public class TesteEncriptacao {
    public static void main(String[] args) {
        
        // Bloco de entrada para testes, alterar aqui para testar novas combinações
        String frase1 = "tenha um bom dia";
        String esperado1 = "taoa eum nmd hbi";
        String frase2 = "ola mundo";
        String esperado2 = "omd luo an";
        String frase3 = "como estao";
        String esperado3 = "cot oea mso";
        
        // Bloco de execução do teste, não modificar aqui
        Encriptacao encriptacao1 = new Encriptacao(frase1);
        Encriptacao encriptacao2 = new Encriptacao(frase2);
        Encriptacao encriptacao3 = new Encriptacao(frase3);
        System.out.println("Teste do exercício 3: Encriptação de strings");
        System.out.println("Teste 1 - Encriptação primeira frase");
        System.out.println(testarString(encriptacao1.encriptar(), esperado1));
        System.out.println("Teste 2 - Encriptação segunda frase");
        System.out.println(testarString(encriptacao2.encriptar(), esperado2));
        System.out.println("Teste 3 - Encriptação terceira frase");
        System.out.println(testarString(encriptacao3.encriptar(), esperado3));
    }

    public static String testarString(String resultado, String esperado) {
        if(resultado.equals(esperado)) {
            return "Sucesso! Resultado: " + resultado + ". Esperado: " + esperado;
        }
        else {
            return "Falhou! Resultado: " + resultado + ". Esperado: " + esperado;
        }
    }
}
