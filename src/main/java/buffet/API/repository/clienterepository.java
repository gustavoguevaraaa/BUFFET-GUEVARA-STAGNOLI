package buffet.API.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import buffet.API.entidades.cliente; 

public interface clienterepository extends JpaRepository<cliente, Long> { 
} 
