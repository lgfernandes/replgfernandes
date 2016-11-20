package cucumber.modelo;

public class ConsomeConta {

	
	public static void main(String[] args) {
		/*
		| dono   | numero | limite | saldo | deposito | primeiro_saque | segundo_saque | saldo_esperado |
	    | Brendo | 111    | 1000   | 0     | 100      | 10             | 10            | 80             |*/
		Conta conta = new Conta("Brendo", 111, 1000.00, 0.0);
		conta.depositar(100.00);
		conta.sacar(10.00);
		conta.sacar(10.00);
		System.out.println(conta.getSaldo());
	}
}
