package esercizio2;

public class Player {
	private String nome;
	private int punteggio;
	private int punteggioOltranza;
	
	public Player(String nome){
		this.nome = nome;
		this.punteggio =0;
		this.punteggioOltranza = 0;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void scores(){
		punteggio++;
	}
	
	public void scoresOltranza(){
		punteggioOltranza++;
	}
	
	public int getPunteggio(){
		return punteggio;
	}
	
	public int getPunteggioOltranza(){
		return punteggioOltranza;
	}
}
