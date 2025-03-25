package TiendaApp.demo.modulos;

import TiendaApp.demo.Enums.EnumEstadoPago;
import TiendaApp.demo.Enums.EnumMetodoPago;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Tabla_Pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private int id_pago;

    // FK id_pedido
    @ManyToOne
    @JoinColumn(name = "fk_pedido", referencedColumnName = "id_pedido")
    @JsonBackReference
    private Pedido pedido;

    @Column(name = "metodo_pago", length = 100, nullable = false)
    private EnumMetodoPago metodo_pago;
    @Column(name = "estado_pago", length = 100, nullable = false)
    private EnumEstadoPago estado_pago;
    @Column(name = "fecha_pago", length = 100, nullable = false)
    private Date fecha_pago;

    public Pago() {
    }

    public Pago(int id_pago, EnumMetodoPago metodo_pago, EnumEstadoPago estado_pago, Date fecha_pago) {
        this.id_pago = id_pago;
        this.metodo_pago = metodo_pago;
        this.estado_pago = estado_pago;
        this.fecha_pago = fecha_pago;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public EnumMetodoPago getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(EnumMetodoPago metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public EnumEstadoPago getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(EnumEstadoPago estado_pago) {
        this.estado_pago = estado_pago;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
}
