package br.com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemPedido {

	//ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItemPedido;
    private int totalItens;
    private double precoTotal;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne
    private Produto produto;

    //CONSTRUTOR
    public ItemPedido() {}

    public ItemPedido(int totalItens, double precoTotal, Pedido pedido, Produto produto) {
        this.totalItens = totalItens;
        this.precoTotal = precoTotal;
        this.pedido = pedido;
        this.produto = produto;
    }

    //GET E SET
    public Long getIdItemPedido() {return idItemPedido;}
    public void setIdItemPedido(Long idItemPedido) {this.idItemPedido = idItemPedido;}
    public int getTotalItens() {return totalItens;}
    public void setTotalItens(int totalItens) {this.totalItens = totalItens;}
    public double getPrecoTotal() {return precoTotal;}
    public void setPrecoTotal(double precoTotal) {this.precoTotal = precoTotal;}
    public Pedido getPedido() {return pedido;}
    public void setPedido(Pedido pedido) {this.pedido = pedido;}
    public Produto getProduto() {return produto;}
    public void setProduto(Produto produto) {this.produto = produto;}
}