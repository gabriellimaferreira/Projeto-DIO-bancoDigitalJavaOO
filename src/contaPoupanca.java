
public class contaPoupanca extends Conta {
	
	public contaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(" === Extrato da conta poupan�a ===");
		super.imprimirInfoComuns();
	}

}