package br.edu.up.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {

	@Id
	@GeneratedValue
	private int idPessoa;

	@Column
	private String primeiroNome;

	@Column
	private String segundoNome;

	@Column
	private String titulo;

	@Column
	private String genero;

	@Column
	private int rg;

	@Column
	private int cpf;

	@Column
	private String cidade;

	@Column
	private String estado;

	@Column
	private String pais;

	@Column
	private String endereco;

	@Column
	private int numeroEndereco;

	@Column
	private int ddi_tel;

	@Column
	private int ddd_tel;

	@Column
	private int telefone;

	@Column
	private String email;

	@Column
	private String login;

	@Column
	private String senha;

	public Pessoa() {

	}

	public Pessoa(int idPessoa, String primeiroNome, String segundoNome, String titulo, String genero, int rg, int cpf,
			String cidade, String estado, String pais, String endereco, int numeroEndereco, int ddi_tel, int ddd_tel,
			int telefone, String email, String login, String senha) {
		
		this.idPessoa = idPessoa;
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.titulo = titulo;
		this.genero = genero;
		this.rg = rg;
		this.cpf = cpf;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.ddi_tel = ddi_tel;
		this.ddd_tel = ddd_tel;
		this.telefone = telefone;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}


	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(int numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public int getDdi_tel() {
		return ddi_tel;
	}

	public void setDdi_tel(int ddi_tel) {
		this.ddi_tel = ddi_tel;
	}

	public int getDdd_tel() {
		return ddd_tel;
	}

	public void setDdd_tel(int ddd_tel) {
		this.ddd_tel = ddd_tel;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	

}
