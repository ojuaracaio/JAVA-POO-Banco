
public class Cliente {
	public int cpf;
	public String nome;
	private Contas contas[];
	public int posicao;
	private static final int QTD_CONTAS = 10;
	
	public Cliente(int cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		contas = new Contas[QTD_CONTAS];
		posicao = 0;
	}
	
	public void AbrirConta(double saldo) {
		if (posicao>=QTD_CONTAS) {
			System.out.println("Número máximo de contas atingido!");
		} else {
			contas[posicao] = new Contas(posicao, saldo);
			posicao++;
		}
		
	}
	
	public void SaldoConta(int id) { 
		contas[id].ConsultarSaldo();
	}
	
	public void Depositar(int id, double quantia) {
		contas[id].Depositar(quantia);
	}
	
	public void Sacar(int id, double quantia) {
		contas[id].Sacar(quantia);
	}
	
	public double SaldoTotal() {
		double total = 0;
		for (int i = 0;i<posicao;i++) {
			total += contas[i].Saldo();
		}
		return total;
	}
}

