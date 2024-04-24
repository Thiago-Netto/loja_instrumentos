package br.com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idcliente;
	private String nome;
	private String endereco;
	private Integer cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String email;
	private String telefone;	

//CONSTRUTOR
	public Cliente() {}
	public Cliente ( Long idcliente,
					String nome, 
					String endereco, 
					Integer cep, 
					String bairro,
					String cidade,
					String estado,
					String email,
					String telefone) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.telefone = telefone;
	}
	
//GET E SET
	public Long getCodCliente() {return idcliente;}
	public void setCodCliente(Long idcliente) {this.idcliente = idcliente;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	public Integer getCep() {return cep;}
	public void setCep(Integer cep) {this.cep = cep;}
	public String getBairro () {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	public String getCidade ( ) {return cidade;}
	public void setCidade(String cidade) {this.cidade=cidade;}
	public String getEstado() {return estado;}
	public void setEstado (String estado) {this.estado=estado;}
	public String getEmail () {return email;}
	public void setEmail(String email) {this.email=email;}
	public String getTelefone () {return telefone;}
	public void setTelefone(String telefone) {this.telefone=telefone;}
	
}
