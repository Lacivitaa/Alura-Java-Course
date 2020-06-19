
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(23213,1203);
		System.out.println(conta.getAgencia());	
		
		Conta conta2 = new Conta(23213,1234);
		System.out.println(conta2.getAgencia());
		
		Conta conta3 = new Conta(23213,1234);
		System.out.println(conta3.getAgencia());
		
		System.out.println(Conta.getTotal());
	}
}
