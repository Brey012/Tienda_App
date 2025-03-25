package TiendaApp.demo.modulos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "Tabla_Direccion")

public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion")
    private Long id_direccion;

    // FK id_usuario
    @ManyToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonBackReference
    private Usuario usuario;

    @Column(name = "calle", length = 100, nullable = false)
    private String calle;
    @Column(name = "ciudad", length = 100, nullable = false)
    private String ciudad;
    @Column(name = "codigo_postal", length = 100, nullable = false)
    private String codigo_postal;
    @Column(name = "pais", length = 100, nullable = false)
    private String pais;

    public Direccion() {
    }

    public Direccion(Long id_direccion, String calle, String ciudad, String codigo_postal, String pais) {
        this.id_direccion = id_direccion;
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigo_postal = codigo_postal;
        this.pais = pais;
    }

    public Long getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
