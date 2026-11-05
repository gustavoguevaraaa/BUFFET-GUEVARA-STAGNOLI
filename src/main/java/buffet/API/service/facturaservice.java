package buffet.API.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import buffet.API.entidades.factura;
import buffet.API.repository.facturarepository;
import buffet.API.iservice.facturaiservice;

@Service 
public class facturaservice implements facturaiservice { 
    @Autowired 
    private facturarepository fRepository; 
    public List<factura> findAllFacturas() { 
        return fRepository.findAll(); 
    } 
    public factura saveFactura(factura factura) { 
        return fRepository.save(factura); 
    }
} 