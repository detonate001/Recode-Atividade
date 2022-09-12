package BilhetePack;

public class Bilhete {

	private int id_bilhete;
	private int data_bilhete;
	private int promocao;
	private int hora;
	public int getId_bilhete() {
		return id_bilhete;
	}
	public void setId_bilhete(int id_bilhete) {
		this.id_bilhete = id_bilhete;
	}
	public int getData_bilhete() {
		return data_bilhete;
	}
	public void setData_bilhete(int data_bilhete) {
		this.data_bilhete = data_bilhete;
	}
	public int getPromocao() {
		return promocao;
	}
	public void setPromocao(int promocao) {
		this.promocao = promocao;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	
}
