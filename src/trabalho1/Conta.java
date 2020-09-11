package trabalho1;

class Conta {
	public Pessoa cliente;
	protected int nrConta;
	protected double saldo;
	
	public Pessoa getCliente() {
		return cliente;
	}
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}	
	public int getNrConta() {
		return nrConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void abrirConta(Pessoa cliente, int nrConta, double saldo) {
		setCliente(cliente);
		this.nrConta = nrConta;
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(saldo - valor >= 0) {
			saldo = saldo - valor;
		}
	}
	private void debitar(double valor) {
		if(saldo - valor >= 0) {
			this.saldo = saldo - valor;
		}
	}
	
}
