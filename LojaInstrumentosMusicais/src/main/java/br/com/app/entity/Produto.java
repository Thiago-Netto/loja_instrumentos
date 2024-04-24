package br.com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

//ATRIBUTO
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	public Long idproduto;
	public String nome;
	public String tipo;
	public Float preco;
	public Integer quantidade;
	public String descricao;
	
//CONSTRUTOR
	public Produto() {}
	public Produto(
			Long idproduto,
			String nome,
			String tipo,
			Float preco,
			Integer quantidade,
			String descricao
			) 
	{
		this.idproduto=idproduto;
		this.nome=nome;
		this.tipo=tipo;
		this.preco=preco;
		this.quantidade=quantidade;
		this.descricao=descricao;			
	}
	
//GET E SET
	public Long getIdProduto () {return idproduto;}
	public void setIdProduto (Long idproduto) {this.idproduto = idproduto;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome=nome;}
	public String getTipo() {return tipo;}
	public void setTipo(String tipo) {this.tipo=tipo;}
	public Float getPreco() {return preco;}
	public void setPreco(Float preco) {this.preco=preco;}
	public Integer getQuantidade() {return quantidade;}
	public void setQuantidade(Integer quantidade) {this.quantidade=quantidade;}
	public String getDescricao() {return descricao;}
	public void setDescricao(String descricao) {this.descricao=descricao;}
}
