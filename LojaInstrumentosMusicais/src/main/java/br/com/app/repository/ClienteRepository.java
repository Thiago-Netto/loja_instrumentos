package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente , Long>{
	
}
