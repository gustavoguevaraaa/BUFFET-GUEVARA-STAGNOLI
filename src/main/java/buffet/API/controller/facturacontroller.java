package buffet.API.controller;
import org.springframework.web.bind.annotation.RestController;
import buffet.API.entidades.factura;
import buffet.API.iservice.facturaiservice;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/facturas")
public class facturacontroller {
    @Autowired
    private facturaiservice facturaservice;

    @GetMapping
    public List<factura> getAllFacturas() {
        return facturaservice.findAllFacturas();
    }

    @PostMapping
    public factura createFactura(@RequestBody factura factura) {
        return facturaservice.saveFactura(factura);
    }
}


