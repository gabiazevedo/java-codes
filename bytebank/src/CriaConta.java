
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // inst�ncia, cria um objeto do tipo Conta na mem�ria
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		System.out.println("segunda conta tem: " + segundaConta.saldo);
		
		System.out.println("atributo titular" + primeiraConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("mesma conta");
		} else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
