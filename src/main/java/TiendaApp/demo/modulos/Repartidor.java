package TiendaApp.demo.modulos;

import jakarta.persistence.*;

@Entity
@Table(name = "Tabla_Repartidor")
public class Repartidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_repartidor")
    private int id_repartidor;

    @Column(name = "nombre_repartidor", length = 100, nullable = false)
    private String nombre_repartidor;
    @Column(name = "telefono_repartidor", length = 100, nullable = false)
    private String telefono_repartidor;
    @Column(name = "email_repartidor", length = 100, nullable = false)
    private String email_repartidor;
    @Column(name = "vehiculo_repartidor", length = 100, nullable = false)
    private String vehiculo_repartidor;

    public Repartidor() {
    }

    public Repartidor(int id_repartidor, String nombre_repartidor, String telefono_repartidor, String email_repartidor, String vehiculo_repartidor) {
        this.id_repartidor = id_repartidor;
        this.nombre_repartidor = nombre_repartidor;
        this.telefono_repartidor = telefono_repartidor;
        this.email_repartidor = email_repartidor;
        this.vehiculo_repartidor = vehiculo_repartidor;
    }

    public int getId_repartidor() {
        return id_repartidor;
    }

    public void setId_repartidor(int id_repartidor) {
        this.id_repartidor = id_repartidor;
    }

    public String getNombre_repartidor() {
        return nombre_repartidor;
    }

    public void setNombre_repartidor(String nombre_repartidor) {
        this.nombre_repartidor = nombre_repartidor;
    }

    public String getTelefono_repartidor() {
        return telefono_repartidor;
    }

    public void setTelefono_repartidor(String telefono_repartidor) {
        this.telefono_repartidor = telefono_repartidor;
    }

    public String getEmail_repartidor() {
        return email_repartidor;
    }

    public void setEmail_repartidor(String email_repartidor) {
        this.email_repartidor = email_repartidor;
    }

    public String getVehiculo_repartidor() {
        return vehiculo_repartidor;
    }

    public void setVehiculo_repartidor(String vehiculo_repartidor) {
        this.vehiculo_repartidor = vehiculo_repartidor;
    }
}
