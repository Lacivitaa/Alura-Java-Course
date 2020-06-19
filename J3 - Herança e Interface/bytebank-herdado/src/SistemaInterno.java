
public class SistemaInterno {

	private int senha = 222;
	
	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Acessado");
		}
		else {
			System.out.println("Negado");
		}
	}
}
