package buffet.API.entidades;
import jakarta.persistence.*; 
import java.util.*;
@Entity
public class cliente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    private String nombre; 
    private String tipo_usuario;
    private String curso;
    private int puntos;

    @OneToMany(mappedBy = "cliente")
    private List<factura> facturas;

    public cliente() {
    }
    

    public cliente(Long id, String nombre, String tipo_usuario, String curso, int puntos) {
        this.id = id;
        this.nombre = nombre;
        this.tipo_usuario = tipo_usuario;
        this.curso = curso;
        this.puntos = puntos;
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

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
