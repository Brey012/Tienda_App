package TiendaApp.demo.modulos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Tabla_Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int id_producto;

    //Fk Id_tienda
    @ManyToOne
    @JoinColumn(name = "fk_tienda", referencedColumnName = "id_tienda")
    @JsonBackReference
    private Tienda tienda;

    // Fk DetallePedido
    @OneToMany(mappedBy = "producto")
    @JsonManagedReference
    private List<DetallePedido> detallePedidos;

    @Column(name = "nombre_producto", length = 100, nullable = false)
    private String nombre_producto;
    @Column(name = "precio_producto", length = 100, nullable = false)
    private double precio_producto;
    @Column(name = "descripcion_producto", length = 100, nullable = false)
    private String descripcion_producto;

    public Producto() {
    }

    public Producto(int id_producto, String nombre_producto, double precio_producto, String descripcion_producto) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        this.descripcion_producto = descripcion_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }
}
