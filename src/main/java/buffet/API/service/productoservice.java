package buffet.API.service;
import buffet.API.entidades.producto;
import buffet.API.iservice.productoiservice;
import buffet.API.repository.productorepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class productoservice implements productoiservice {

    private productorepository productorepository;

    public productoservice(productorepository productorepository) {
        this.productorepository = productorepository;
    }

    @Override
    public List<producto> findAllProductos() {
        return productorepository.findAll();
    }

    @Override
    public producto saveProducto(producto producto) {
        return productorepository.save(producto);
    }
}
