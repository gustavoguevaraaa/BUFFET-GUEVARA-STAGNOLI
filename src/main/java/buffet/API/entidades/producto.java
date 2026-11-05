package buffet.API.entidades;
import jakarta.persistence.*; 
import java.util.*;
@Entity
public class producto {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private String nombre; 
    private String categoria;
    private String tipo;
    private int stock;
    private float precio;

    @ManyToMany(mappedBy = "producto")
    private List<factura> factura;

    public producto() {
    }  

    public producto(Long id, String nombre, String categoria, String tipo, int stock, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.tipo = tipo;
        this.stock = stock;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
