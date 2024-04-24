package br.com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class PessoaFisica extends Cliente {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private String cpf;
	private String rg;
	
	//CONSTRUTOR
	public PessoaFisica () {}
	
	public PessoaFisica(	Long idcliente, 
							String nome, 
							String endereco, 
							Integer cep, 
							String bairro,
							String cidade,
							String estado,
							String email,
							String telefone,
							String cpf,
							String rg) {
        super(idcliente, nome, endereco, cep, bairro, cidade, estado, email, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }
	
	//GET E SET
	public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public String getRg() {return rg;}
    public void setRg(String rg) {this.rg = rg;}	

}