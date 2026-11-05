package buffet.API.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import buffet.API.entidades.producto;

public interface productorepository extends JpaRepository<producto, Long> {

}
