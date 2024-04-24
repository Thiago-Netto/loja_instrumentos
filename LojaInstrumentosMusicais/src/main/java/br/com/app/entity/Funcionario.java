package br.com.app.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idfuncionario;
	private Long idsetor;
	private String setor;
	private Date dataadmissao;
	private String nome;
	private Long ncarteiratrabalho;
	private String endereco;
	private Integer cep;
	private String bairro;
	private String cidade;
	private String estado;
	private String email;
	private String telefone;
	
	//CONSTRUTOR
	
	public Funcionario () {}
	public Funcionario (
		Long idfuncionario,
		Long idsetor,
		String setor,
		Date dataadmissao,
		String nome,
		Long ncarteiratrabalho,
		String endereco,
		Integer cep,
		String bairro,
		String cidade,
		String estado,
		String email,
		String telefone
		) 
		{
		this.idfuncionario = idfuncionario;
		this.idsetor = idsetor;
		this.setor = setor;
		this.dataadmissao = dataadmissao;
		this.nome = nome;
		this.ncarteiratrabalho = ncarteiratrabalho;
		this.endereco = endereco;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.telefone = telefone;	
		}

// GET E SET	
	//Id funcionário
	public Long getIdFuncionario() {return idfuncionario;}
	public void setIdFuncionario(Long idfuncionario) {this.idfuncionario = idfuncionario;}
	//Id setor
	public Long getIdSetor() {return idsetor;}
	public void setIdSetor(Long idsetor) {this.idsetor = idsetor;}
	//Setor
	public String getSetor() {return setor;}
	public void setSetor(String setor) {this.setor=setor;}
	//Data da admissão
	public Date getDataAdmissao() {return dataadmissao;}
	public void setDataAdmissao(Date dataadmissao) {this.dataadmissao = dataadmissao;}
	//Nome
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	//Número da carteira de trabalho
	public Long getNCarteiraTrabalho() {return ncarteiratrabalho;}
	public void setNCarteiraTrabalho(Long ncarteiratrabalho) {this.ncarteiratrabalho = ncarteiratrabalho;}
	//Endereço
	public String getEndereco() {return endereco;}
	public void setEndereco(String endereco) {this.endereco = endereco;}
	//Cep
	public Integer getCep() {return cep;}
	public void setCep(Integer cep) {this.cep = cep;}
	//Bairro
	public String getBairro() {return bairro;}
	public void setBairro(String bairro) {this.bairro = bairro;}
	//Cidade
	public String getCidade() {return cidade;}
	public void setCidade(String cidade) {this.cidade = cidade;}
	//Estado
	public String getEstado() {return estado;}
	public void setEstado(String estado) {this.estado =estado;}
	//Email
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email=email;}
	//Telefone
	public String getTelefone() {return telefone;}
	public void setTelefone(String telefone) {this.telefone=telefone;}

}
