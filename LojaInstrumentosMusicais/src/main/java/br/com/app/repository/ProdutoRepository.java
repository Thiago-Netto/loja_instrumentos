package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
