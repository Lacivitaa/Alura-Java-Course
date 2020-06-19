
public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando");
		return super.getSalario();
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}
