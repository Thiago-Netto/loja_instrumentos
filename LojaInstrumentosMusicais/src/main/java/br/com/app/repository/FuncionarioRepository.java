package br.com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.app.entity.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario , Long>{
	
}
