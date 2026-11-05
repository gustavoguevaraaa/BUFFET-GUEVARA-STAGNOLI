package buffet.API.iservice;
import buffet.API.entidades.factura;
import java.util.List;

public interface facturaiservice {
    public List<factura> findAllFacturas();
    public factura saveFactura(factura factura);
}
