
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario amor = new Gerente();
		amor.setNome("Isabela");
		amor.setCpf("4563455421");
		amor.setSalario(2500.00);
		
		System.out.println(amor.getNome());
		System.out.println(amor.getBonificacao());
		
		//amor.salario = 300.0;
	}
}
