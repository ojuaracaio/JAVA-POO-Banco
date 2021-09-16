
public class Contas {
	private int numero;
	private double saldo;
	
	public Contas(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void ConsultarSaldo() {
		System.out.printf("Saldo na conta %d: R$%.2f\n",numero,saldo);
	}
	public double Saldo() {
		return saldo;
	}
	
	public void Depositar(double quantia) {
		saldo += quantia;
		System.out.printf("A quantia de R$%.2f foi depositada com sucesso na conta %d!\n", quantia, numero);
	}
	
	public void Sacar(double quantia) {
		if ((saldo - quantia)<0) {
			System.out.println("Saldo insuficiente para realizar saque!");
		} else {
			saldo -= quantia;
			System.out.printf("A quantia de R$%.2f foi sacada com sucesso na conta %d!\n", quantia, numero);
		}
		
	}
}
