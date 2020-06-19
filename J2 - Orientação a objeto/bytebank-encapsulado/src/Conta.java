

public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int numero, int agencia) {
		Conta.total++;
		System.out.println("O total de contas �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta");
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor)
		{
			this.saldo -= valor;
			return true;
		}
		else 
		{
			System.out.println("Saldo insuficiente");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
		if (this.saldo >= valor) 
		{
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Valor invalido");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia (int agencia) {
		if (agencia <= 0) {
			System.out.println("Valor invalido");
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
