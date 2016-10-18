package model;

public class Usuario {
	private int id_Usuario;
	private String nick;
	private String email;
	private String senha;
	
	public int getId_Usuario() {
		return id_Usuario;
	} 
	public void setId(int id) {
		this.id_Usuario = id;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
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
}
