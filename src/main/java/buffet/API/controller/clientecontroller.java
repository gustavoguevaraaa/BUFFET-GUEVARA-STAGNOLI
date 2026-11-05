package buffet.API.controller;
import org.springframework.web.bind.annotation.RestController;
import buffet.API.entidades.cliente;
import buffet.API.iservice.clienteiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/clientes")
public class clientecontroller {
    @Autowired
    private clienteiservice clienteservice;

    @GetMapping
    public List<cliente> getAllClientes() {
        return clienteservice.findAllClientes();
    }

    @PostMapping
    public cliente createCliente(@RequestBody cliente cliente) {
        return clienteservice.saveCliente(cliente);
    }
}


