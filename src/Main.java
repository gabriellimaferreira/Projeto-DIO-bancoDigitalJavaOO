
public class Main {
	public static void main(String[] args) {
		
		Cliente Gabriel = new Cliente();
		Gabriel.setNome("Gabriel");
		
		Conta cc = new ContaCorrente(Gabriel);
		Conta cp = new contaPoupanca(Gabriel);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}
}
