package model;

public class Clientes {
	
	private int idclientes;
	private String nome;
	private String sobreome;
	private String dataNascimento;
	private String cpf;
	private String naturalidade;
	private String nacionalidade;
	private String sexo;
	private String email;
	private String celular;
	
	
	public int getIdclientes() {
		return idclientes;
	}
	public void setIdclientes(int idclientes) {
		this.idclientes = idclientes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreome() {
		return sobreome;
	}
	public void setSobreome(String sobreome) {
		this.sobreome = sobreome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	@Override
	public String toString() {
		return "Clientes [idclientes=" + idclientes + ", nome=" + nome + ", sobreome=" + sobreome + ", dataNascimento="
				+ dataNascimento + ", cpf=" + cpf + ", naturalidade=" + naturalidade + ", nacionalidade="
				+ nacionalidade + ", sexo=" + sexo + ", email=" + email + ", celular=" + celular + "]";
	}
		

	
}
