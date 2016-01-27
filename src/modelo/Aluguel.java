package modelo;

public class Aluguel {
	private String tema;
	private int horaIncio;
	private int horaFim;
	private double preco;
	
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getHoraIncio() {
		return horaIncio;
	}
	public void setHoraIncio(int horaIncio) {
		this.horaIncio = horaIncio;
	}
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
