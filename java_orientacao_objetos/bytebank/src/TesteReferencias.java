public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta);
		
		segundaConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
	}
}
