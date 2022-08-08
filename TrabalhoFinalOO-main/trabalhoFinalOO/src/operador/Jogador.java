package operador;

public class Jogador extends Pessoa {
	private int totalGols;
	private String posicao;
	
	//Metodos concretos
	public void fazerGol() {
		this.setTotalGols(this.getTotalGols() + 1);;
	}
	

	//Construtores
	public Jogador(String nome, String posicao) {
		super();
		this.setTotalGols(0);
		this.posicao = posicao;
		setNome(nome);
	}
	
	public Jogador() {
		super();
	}
	
	
	//Getters & Setters
	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}


	public int getTotalGols() {
		return totalGols;
	}

	public void setTotalGols(int totalGols) {
		this.totalGols = totalGols;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome: " + this.getNome() +"\nposicao: " + this.getPosicao();
	}
}

