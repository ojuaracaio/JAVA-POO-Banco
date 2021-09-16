
public class Banco {
	public String nome;
	public Agencia agencias[];
	private static final int QTD_AGENCIAS = 10;
	int posicao;
	
	public Banco(String nome) {
		this.nome = nome;
		agencias = new Agencia[QTD_AGENCIAS];
		posicao = 0;
	}
	
	public void CadastrarAgencia(Agencia agencia) {
		if (posicao >= QTD_AGENCIAS) {
			System.out.println("Número máximo de agencias atingido!");
		} else {
			agencias[posicao] = agencia;
			posicao++;
		}
	}
	
	public void NumeroClientes() {
		int total = 0;
		System.out.printf("\nClientes no Banco %s\n",nome);
		for (int j = 0;j<posicao;j++) {
			System.out.printf("	-Agência %d: %d Clientes\n",agencias[j].numero,agencias[j].posicao);
			total += agencias[j].posicao;
		}
		System.out.printf("Total de Clientes no Banco %s: %d\n",nome,total);
	}
	
	public void SaldoAgencias() {
		double total = 0;
		System.out.printf("\nSaldo no Banco %s\n",nome);
		for (int k = 0;k<posicao;k++) {
			System.out.printf("	-Agência %d: R$ %.2f\n",agencias[k].numero,agencias[k].TotalAgencia());
			total += agencias[k].TotalAgencia();
		}
		System.out.printf("Total Depositado no Banco %s: R$%.2f\n",nome,total);
	}
}
