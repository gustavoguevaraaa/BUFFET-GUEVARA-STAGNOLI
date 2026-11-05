package buffet.API.entidades;
import jakarta.persistence.*; 
import java.util.*;
import buffet.API.entidades.cliente;
import buffet.API.entidades.producto;
@Entity
public class factura {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private int fecha_hora; 
    private String forma_pago;
    private float total;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private cliente cliente;

    @ManyToMany
    @JoinTable( 
        name = "producto_tabla", 
        joinColumns = @JoinColumn(name = "tablaproducto_id"),  
        inverseJoinColumns = @JoinColumn(name = "producto_id")  
    ) 
    private List<producto> ProductoList;

    public factura() {
    }

    public factura(Long id, int fecha_hora, String forma_pago, float total) {
        this.id = id;
        this.fecha_hora = fecha_hora;
        this.forma_pago = forma_pago;
        this.total = total;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public int getFecha_hora() {
        return fecha_hora;
    }   

    public void setFecha_hora(int fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }  

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

}
