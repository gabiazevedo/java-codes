public class Conta {
	private double saldo; // atributo do objeto do tipo conta
	private int agencia; // atributo do objeto do tipo conta
	private int numero; // atributo do objeto do tipo conta
	private Cliente titular; 
	private static int total; // atributo da classe (Conta) e n�o do objeto
	
	public Conta(int agencia, int numero) {
		Conta.total++; 
		System.out.println("o total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta " + this.numero);
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} 
		return false;
	}
	
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		//aqui � poss�vel fazer as regras de neg�cio para este atributo
		if (numero <= 0) {
			System.out.println("n�o pode valor <= 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("n�o pode valor <= 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		// dentro de um m�todo est�tico n�o � permitido acessar um atributo de inst�ncia (this)
		return Conta.total;
	}
}