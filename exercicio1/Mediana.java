package exercicio1;

public class Mediana {

	/**
	 * Esta classe recebe uma lista de números inteiros desordenada para encontrar a mediana. 
	 * Apenas funciona na operação de arrays com número de elementos ímpares. Para utilizar 
	 * esta classe, é necessário criar uma instância desta classe passando o array da lista de 
	 * números e então utilizar o método calcularMediana. A classe retorna o número inteiro
	 * que é a mediana da lista.
	 */

	private boolean repetir;
	private int[] lista;
	private int tamanhoLista;
	private int posicaoMediana;
	
	public Mediana(int[] lista) {
		this.lista = lista;
		tamanhoLista = lista.length;
		posicaoMediana = (tamanhoLista / 2);
	}
	
	public int calcularMediana() {
		ordenar();
		return lista[posicaoMediana];
	}
	
	private void ordenar () {
		repetir = false;
		bubbleSort();
		
		if(repetir == true) {
			ordenar();
		}
	}
	
	private void bubbleSort() {
		int aux;
		
		for(int i = 0; i < tamanhoLista-1; i++) {
				if(lista[i] > lista[i+1]){
					aux = lista[i];
					lista[i] = lista[i+1];
					lista[i+1] = aux;
					repetir = true;
				}
		}

	}
}