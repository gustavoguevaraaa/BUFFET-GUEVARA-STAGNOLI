package buffet.API.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import buffet.API.entidades.cliente;
import buffet.API.repository.clienterepository;
import buffet.API.iservice.clienteiservice;

@Service 
public class clienteservice implements clienteiservice { 
    @Autowired 
    private clienterepository cRepository; 
    public List<cliente> findAllClientes() { 
        return cRepository.findAll(); 
    } 
    public cliente saveCliente(cliente cliente) { 
        return cRepository.save(cliente); 
    }
} 