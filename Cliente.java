
public class Cliente {

	private String nome;
    private int idade;
    private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public int getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf) throws CpfInvalidoException {
        if (cpf == null || cpf.length() != 11) {
            throw new CpfInvalidoException("CPF deve estar no formato xxx.xxx.xxx-xx");
        }
        this.cpf = cpf;
    }
}
      
    
