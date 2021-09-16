
public class Agencia {
	int numero;
	Cliente clientes[];
	int posicao;
	private static final int QTD_CLIENTES = 10;
	
	public Agencia(int numero) {
		this.numero = numero;
		clientes = new Cliente[QTD_CLIENTES];
		posicao = 0;
	}
	
	public void CadastrarCliente(Cliente cliente) {
		if (posicao>=QTD_CLIENTES) {
			System.out.println("Número máximo de clientes atingido!");
		} else {
			clientes[posicao] = cliente;
			posicao++;
		}
	}
	
	public void SaldosClientes() {
		System.out.printf("Saldos dos Clientes da Agencia %d:\n",numero);
		System.out.println("------------------------------------");
		for(int i=0;i<posicao;i++) {
			System.out.printf("Cliente: %s | CPF: %d | Total: R$%.2f\n",clientes[i].nome,clientes[i].cpf,clientes[i].SaldoTotal());
			for(int j=0;j<clientes[i].posicao;j++) {
				System.out.print("	-");
				clientes[i].SaldoConta(j);
			}
		}
		System.out.println("------------------------------------");
	}
	
	public double TotalAgencia() {
		double total = 0;
		for(int i=0;i<posicao;i++) {
			total += clientes[i].SaldoTotal();
		}
		return total;
	}
}
