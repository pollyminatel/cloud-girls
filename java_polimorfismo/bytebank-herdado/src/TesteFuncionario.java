
public class TesteFuncionario {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("222222222-9");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
