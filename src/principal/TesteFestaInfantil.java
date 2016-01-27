package principal;

import modelo.Cliente;
import modelo.FestaInfantil;

public class TesteFestaInfantil {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Maria",32224567,2015);
		
		FestaInfantil novo = new FestaInfantil(cliente);
		
		novo.getCliente().getAluguel().setTema("cinderela");
		novo.getCliente().getAluguel().setPreco(350);
		
		novo.precoAluguelPorTempo();
		
		System.out.println(novo.getCliente());

	}

}
