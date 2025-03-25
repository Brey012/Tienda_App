package TiendaApp.demo.modulos;

import TiendaApp.demo.Enums.EnumEstadoEntrega;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Tabla_Entrega")
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega")
    private int id_entrega;

    // FK id_pedido
    @ManyToOne
    @JoinColumn(name = "fk_pedido", referencedColumnName = "id_pedido")
    @JsonBackReference
    private Pedido pedido;

    // FK id_repartidor
    @ManyToOne
    @JoinColumn(name = "fk_repartidor", referencedColumnName = "id_repartidor")
    @JsonBackReference
    private Repartidor repartidor;

    @Column(name = "fecha_entrega", length = 100, nullable = false)
    private Date fecha_entrega;
    @Column(name = "estado_entrega", length = 100, nullable = false)
    private EnumEstadoEntrega estado_entrega;

    public Entrega() {
    }

    public Entrega(int id_entrega, Date fecha_entrega, EnumEstadoEntrega estado_entrega) {
        this.id_entrega = id_entrega;
        this.fecha_entrega = fecha_entrega;
        this.estado_entrega = estado_entrega;
    }

    public int getId_entrega() {
        return id_entrega;
    }

    public void setId_entrega(int id_entrega) {
        this.id_entrega = id_entrega;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public EnumEstadoEntrega getEstado_entrega() {
        return estado_entrega;
    }

    public void setEstado_entrega(EnumEstadoEntrega estado_entrega) {
        this.estado_entrega = estado_entrega;
    }
}
