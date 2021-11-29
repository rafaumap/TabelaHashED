package controller;

public class TabelaHash {

	public TabelaHash() { }

	public int minhaFuncaoHash(long chave) {
		return (int)(chave % 3 *2);
	}
	
}