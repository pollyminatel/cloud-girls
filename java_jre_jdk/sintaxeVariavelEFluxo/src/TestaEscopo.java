public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 5;
		int quantidadePessoas = 2;
		
		boolean acompanhado = false;
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
