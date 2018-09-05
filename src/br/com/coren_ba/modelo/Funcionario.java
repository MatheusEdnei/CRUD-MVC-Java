package br.com.coren_ba.modelo;

public class Funcionario {
	
	private int Matricula;
	private String Nome;
	private String Sobrenome;
	private String Funcao;
	private String Localizacao;
	private String Usuario;
	private String Email;
	
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public String getFuncao() {
		return Funcao;
	}
	public void setFuncao(String funcao) {
		Funcao = funcao;
	}
	public String getLocalizacao() {
		return Localizacao;
	}
	public void setLocalizacao(String localizacao) {
		Localizacao = localizacao;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuário) {
		Usuario = usuário;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}