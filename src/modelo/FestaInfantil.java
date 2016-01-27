package modelo;

public class FestaInfantil {
	private Cliente cliente;
	
	public FestaInfantil(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void precoAluguelPorTempo() {
		if(cliente.getDataCadastro() <= 2014){
			double precoAluguel = cliente.getAluguel().getPreco();
			cliente.getAluguel().setPreco(precoAluguel - precoAluguel * 0.1);
			
			
		}
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	
}
