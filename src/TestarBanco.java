
public class TestarBanco {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(111,"Joãozinho");
		cliente1.AbrirConta(0);
		cliente1.Depositar(0, 150);
		cliente1.AbrirConta(200);
		cliente1.Sacar(1, 35);
		cliente1.SaldoConta(1);
		
		Cliente cliente2 = new Cliente(222,"Mariazinha");
		cliente2.AbrirConta(200);
		cliente2.Sacar(0, 300);
		cliente2.SaldoConta(0);
		
		Agencia agencia0 = new Agencia(0);
		agencia0.CadastrarCliente(cliente1);
		agencia0.CadastrarCliente(cliente2);
		agencia0.SaldosClientes();
		
		Cliente cliente3 = new Cliente(333,"Pedrinho");
		cliente3.AbrirConta(100);
		cliente3.AbrirConta(200);
		cliente3.AbrirConta(300);
		
		Agencia agencia1 = new Agencia(1);
		agencia1.CadastrarCliente(cliente3);
		
		Cliente cliente4 = new Cliente(444,"Aninha");
		cliente4.AbrirConta(12);
		cliente4.AbrirConta(23);
		cliente4.AbrirConta(34);
		cliente4.AbrirConta(45);
		
		Cliente cliente5 = new Cliente(555,"Robertinho");
		cliente5.AbrirConta(111);
		cliente5.AbrirConta(222);
		cliente5.AbrirConta(333);
		cliente5.AbrirConta(444);
		cliente5.AbrirConta(555);
		
		Agencia agencia2 = new Agencia(2);
		agencia2.CadastrarCliente(cliente4);
		agencia2.CadastrarCliente(cliente5);
		
		Banco bancomunicipal = new Banco("Municipal");
		bancomunicipal.CadastrarAgencia(agencia0);
		bancomunicipal.CadastrarAgencia(agencia1);
		bancomunicipal.CadastrarAgencia(agencia2);
		bancomunicipal.NumeroClientes();
		bancomunicipal.SaldoAgencias();
	}
}
