package TiendaApp.demo.modulos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Tabla_Tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private int id_tienda;

    @OneToMany(mappedBy = "tienda")
    @JsonManagedReference
    private List<Producto> productos;

    @Column(name = "nombre_tienda", length = 100, nullable = false)
    private String nombre_tienda;
    @Column(name = "direccion_tienda", length = 100, nullable = false)
    private String direccion_tienda;
    @Column(name = "telefono_tienda", length = 100, nullable = false)
    private String telefono_tienda;
    @Column(name = "categoria_tienda", length = 100, nullable = false)
    private String categoria_tienda;

    public Tienda() {
    }

    public Tienda(int id_tienda, String nombre_tienda, String direccion_tienda, String telefono_tienda, String categoria_tienda) {
        this.id_tienda = id_tienda;
        this.nombre_tienda = nombre_tienda;
        this.direccion_tienda = direccion_tienda;
        this.telefono_tienda = telefono_tienda;
        this.categoria_tienda = categoria_tienda;
    }


}
