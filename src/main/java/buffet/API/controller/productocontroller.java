package buffet.API.controller;
import org.springframework.web.bind.annotation.RestController;
import buffet.API.entidades.producto;  
import buffet.API.iservice.productoiservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/productos")
public class productocontroller {
    @Autowired
    private productoiservice productoservice;

    @GetMapping
    public List<producto> getAllProductos() {
        return productoservice.findAllProductos();
    }

    @PostMapping
    public producto createProducto(@RequestBody producto producto) {
        return productoservice.saveProducto(producto);
    }
}
