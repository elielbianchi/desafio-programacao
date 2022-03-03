public class Mediana {
	private boolean repetir;
	private int[] lista;
	private int tamanhoLista;
	private int posicaoMediana;
	
	public Mediana(int[] lista) {
		this.lista = lista;
		tamanhoLista = lista.length;
		posicaoMediana = (tamanhoLista / 2);
	}
	
	public int calculaMediana() {
		ordenar();
		return lista[posicaoMediana];
	}
	
	public void ordenar () {
		repetir = false;
		bubbleSort();
		
		if(repetir == true) {
			ordenar();
		}
	}
	
	public void bubbleSort() {
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