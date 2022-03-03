package exercicio3;

public class Encriptacao {
    /** 
     * O código faz encriptação de uma string fornecida, considerando a raiz quadrada do 
     * total de caracteres da frase desconsiderando os espaços em branco como uma das regras. 
     * O número de palavras retorna igual a esse número da regra e os caracteres de cada 
     * palavra não são maiores do que esse número. As letras retornam alternadas conforme 
     * regra específica baseada em grid. Para utilizar esta classe, é necessário criar uma
     * instância desta classe passando como parâmetro a string desejada e então utilizar
     * o método encriptar, o qual retorna a string já encriptada.
    */

    private String fraseOriginal;
    private String fraseEncriptada;
    private int tamanhoTexto;
    private int limiteInferior;
    private int limiteSuperior;
    private int colunas;

    public Encriptacao(String frase) {
        fraseOriginal = frase.replace(" ","");
        tamanhoTexto = fraseOriginal.length();
        limiteInferior = (int)Math.pow(tamanhoTexto,0.5);
        limiteSuperior = limiteInferior + 1;
    }

    public String encriptar() {
        definirLinhasColunas();
        fraseEncriptada = modificarFrase();
        return fraseEncriptada;
    }

    private void definirLinhasColunas() {
        if(tamanhoTexto == limiteInferior*limiteInferior) {
            colunas = limiteInferior;
        } else {
            colunas = limiteSuperior;
        }
    }

    private String modificarFrase () {
        String modificacao = "";
        
        for(int coluna = 0; coluna < colunas; coluna++) {
            
            for(int linha = coluna; linha < tamanhoTexto; linha += colunas) {
                modificacao = modificacao + fraseOriginal.charAt(linha);
            }
            
            if(coluna+1 < colunas) {
                modificacao = modificacao + " ";
            }
        }
        return modificacao;
    }
}
