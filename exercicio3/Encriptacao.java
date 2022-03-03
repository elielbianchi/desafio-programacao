package exercicio3;

public class Encriptacao {
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
