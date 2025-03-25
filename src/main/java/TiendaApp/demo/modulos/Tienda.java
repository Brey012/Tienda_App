package TiendaApp.demo.modulos;

import jakarta.persistence.*;

@Entity
@Table(name="Tabla_Tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private int id_tienda;

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

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public String getDireccion_tienda() {
        return direccion_tienda;
    }

    public void setDireccion_tienda(String direccion_tienda) {
        this.direccion_tienda = direccion_tienda;
    }

    public String getTelefono_tienda() {
        return telefono_tienda;
    }

    public void setTelefono_tienda(String telefono_tienda) {
        this.telefono_tienda = telefono_tienda;
    }

    public String getCategoria_tienda() {
        return categoria_tienda;
    }

    public void setCategoria_tienda(String categoria_tienda) {
        this.categoria_tienda = categoria_tienda;
    }
}
