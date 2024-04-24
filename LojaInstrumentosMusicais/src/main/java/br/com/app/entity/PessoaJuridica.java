package br.com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PessoaJuridica extends Cliente {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private String cnpj;
	private String responsavel;
	
	//CONSTRUTOR
	public PessoaJuridica () {}
	
	public PessoaJuridica(	Long idcliente, 
							String nome, 
							String endereco, 
							Integer cep, 
							String bairro,
							String cidade,
							String estado,
							String email,
							String telefone,
							String cnpj,
							String responsavel) {
        super(idcliente, nome, endereco, cep, bairro, cidade, estado, email, telefone);
        this.cnpj = cnpj;
        this.responsavel = responsavel;
    }
	
	//GET E SET
	public String getCnpj() {return cnpj;}
    public void setCnpj(String cnpj) {this.cnpj = cnpj;}
    public String getResponsavel() {return responsavel;}
    public void setResponsavel(String responsavel) {this.responsavel = responsavel;}	

}
