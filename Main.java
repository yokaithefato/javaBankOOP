
public class Main {

	public static void main(String[] args) {
		Cliente wallace = new Cliente();
		wallace.setNome("wallace");
        wallace.setIdade(20);
   
     
       try{
        wallace.setCpf("12345678910"); 
        System.out.println("CPF definido com sucesso"+wallace.getCpf());
       }
       catch (CpfInvalidoException e){ 
        System.out.println(e.getMessage());
        }

		Conta cc = new ContaCorrente(wallace);
		Conta poupanca = new ContaPoupanca(wallace);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        
	}

}