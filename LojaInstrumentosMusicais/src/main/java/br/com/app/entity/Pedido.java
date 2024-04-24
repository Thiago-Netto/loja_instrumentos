package br.com.app.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Pedido {
	
	//ATRIBUTOS
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPedido;
	private LocalDate data;
	private LocalTime hora;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToMany
	private List<ItemPedido> itens;
	
	//CONSTRUTOR
	public Pedido() {}
	public Pedido(
			Long idPedido, 
			LocalDate data, 
			LocalTime hora,
			Cliente cliente, 
			List<ItemPedido> itens
			) { 
		this.idPedido=idPedido;
		this.data=data;
		this.hora=hora;
		this.cliente=cliente;
		this.itens=itens;
	}
	
	//GET E SET
	public Long getIdPedido() {return idPedido;}
    public void setIdPedido(Long idPedido) {this.idPedido = idPedido;}
    public LocalDate getData() {return data;}
    public void setData(LocalDate data) {this.data = data;}
    public LocalTime getHora() {return hora;}
    public void setHora(LocalTime hora) {this.hora = hora;}
    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}
    public List<ItemPedido> getItens() {return itens;}
    public void setItens(List<ItemPedido> itens) {this.itens = itens;}
}
