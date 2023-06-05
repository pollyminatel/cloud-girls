package banco.teste;

import banco.modelo.ContaCorrente;
import banco.modelo.ContaPoupanca;
import banco.modelo.Cliente;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
	
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;	
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
