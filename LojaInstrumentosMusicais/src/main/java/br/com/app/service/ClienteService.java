package br.com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.app.repository.ClienteRepository;
import br.com.app.entity.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> procuraClientes(){return repository.findAll();}
	public Cliente procurarClientePorId(Long id) {return repository.findById(id).get();}
	public String adicionarCliente(Cliente cliente) {repository.save(cliente); return "Cliente adicionado com sucesso!";}
	public String editarCliente(Long id, Cliente cliente) {
        Cliente response = repository.findById(id).orElse(null);
        
        if (response != null) {
            response.setNome(cliente.getNome());
            response.setEndereco(cliente.getEndereco());
            response.setCep(cliente.getCep());
            response.setBairro(cliente.getBairro());
            response.setCidade(cliente.getCidade());
            response.setEstado(cliente.getEstado());
            response.setEmail(cliente.getEmail());
            response.setTelefone(cliente.getTelefone());
            
            repository.save(response); 
            
            return "Cliente editado com sucesso!";
        } else {
            return "Cliente não encontrado!";
        }
    }
	public String excluirCliente(Long id) {
        Cliente cliente = repository.findById(id).orElse(null);
        
        if (cliente != null) {
            repository.delete(cliente); // Excluir o cliente do banco de dados
            return "Cliente excluído com sucesso!";
        } else {
            return "Cliente não encontrado!";
        }
    }
}
