package modelo;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria(5, 500, "Lucivan");
		System.out.println("Valor Atual da Conta: " + conta.getSaldo());
		conta.deposito(100);
		conta.saque(50);
		conta.deposito(20);
		conta.saque(10);
		conta.mostrar();
		System.out.println("Valor Atual da Conta: " + conta.getSaldo());
	}

}
