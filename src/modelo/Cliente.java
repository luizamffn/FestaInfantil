package modelo;

public class Cliente {
	private String nome;
	private int telefone;
	private Endereco endereco;
	private int anoCadastro;
	private Aluguel aluguel;
	
	public Cliente(String nome, int telefone,int anoCadastro) {
		this.nome = nome;
		this.telefone = telefone;
		this.anoCadastro = anoCadastro;
		
		endereco = new Endereco();
		aluguel = new Aluguel();
	}
	
	@Override
	public String toString() {
		String dados = "Cliente : " + this.nome +"\n"
				+"Tema do aluguel: " + this.getAluguel().getTema() + "\n"
				+"Preço: " + this.getAluguel().getPreco() + "\n";
			
				if(this.anoCadastro <=2014){
					dados += "Obrigado(a) pela fidelidade com nossa empresa!";
				}else{
					dados += "Obrigado(a) pela escolha, volte sempre!";
				}
		
		return dados;
				
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	
	public int getDataCadastro() {
		return anoCadastro;
	}
	public void setDataCadastro(int dataCadastro) {
		this.anoCadastro = dataCadastro;
	}
	public Aluguel getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}
	
	
}
