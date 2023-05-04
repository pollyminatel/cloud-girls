
public class TestaConversao {

	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario;
		
		System.out.println(valor);

		long numeroLong = 12345678912l;
		System.out.println(numeroLong);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1+valor2);
		System.out.println(0.2f+0.1f);
	}

}
