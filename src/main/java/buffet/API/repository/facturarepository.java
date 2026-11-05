package buffet.API.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import buffet.API.entidades.factura;

public interface facturarepository    extends JpaRepository<factura, Long> {

}
