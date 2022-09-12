package ClientePack;

public class Cliente {
	private int id_cliente;
	private int cpf;
	private String email;
	private String senha;
	private int data_nascimento;
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(int data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

}
