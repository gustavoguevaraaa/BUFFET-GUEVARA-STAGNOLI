package buffet.API.iservice;
import buffet.API.entidades.producto;
import java.util.List;

public interface productoiservice {
    public List<producto> findAllProductos();
    public producto saveProducto(producto producto);
}
