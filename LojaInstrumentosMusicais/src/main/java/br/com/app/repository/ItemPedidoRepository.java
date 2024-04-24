package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.entity.ItemPedido;
@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long>{

}
