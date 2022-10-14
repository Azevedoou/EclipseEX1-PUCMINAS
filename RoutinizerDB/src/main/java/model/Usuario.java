package model;

public class Usuario {
	private String id;
	private String login;
	private String senha;
	private String nome;
	private String email;	
	
	public Usuario() {
		id = "-1";
		login = "";
		senha = "";
		nome = "";
		email = "";
	}

	public Usuario(String id, String login, String senha, String nome, String email) {
		setId(id);
		setLogin(login);
		setSenha(senha);
		setNome(nome);
		setEmail(email);
	}		
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Object obj) {
		return (this.getId() == ((Usuario) obj).getId());
	}	
}