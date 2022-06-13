
public class TesteIR {

	// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de R$ 142
	// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
	// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636

	public static void main(String[] args) {
		double salario = 1899.0;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println(salario = salario - 142.0);
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println(salario = salario - 350.0);
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			System.out.println(salario = salario - 636.0);
		} else {
			System.out.println("Salario: " + salario + " fora da faixa de cobrança do imposto de renda.");
		}
	}

}
