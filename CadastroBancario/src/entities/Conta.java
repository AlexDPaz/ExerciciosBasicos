package entities;

public class Conta {

	private int numConta;
	private String nome;
	private double balanco;

	public Conta(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public Conta(int numConta, String nome, double depositoInicial) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		// chamar operação de pedosito passando o valor como argumento
		depositar(depositoInicial);
		// para melhorias no futuro e se modar a regra de deposito só altera o metodo 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBalanco() {
		return balanco;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public void depositar(double deposito) {
		balanco += deposito;
	}
	
	public void retirada(double saque) {
		 balanco -= saque + 5.0;
	}

	@Override
	public String toString() {
		return "Conta: "
			    + numConta 
			    + ", Nome: " 
			    + nome 
			    + ", Balanço: $ " 
			    + String.format("%.2f%n",balanco) ;
	}
	


}
