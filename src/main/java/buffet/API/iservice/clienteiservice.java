package buffet.API.iservice;
import buffet.API.entidades.cliente;
import java.util.List;

public interface clienteiservice {
    public List<cliente> findAllClientes();
    public cliente saveCliente(cliente cliente);
}
