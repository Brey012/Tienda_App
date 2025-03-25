package TiendaApp.demo.modulos;

import TiendaApp.demo.Enums.EnumEstadoPedido;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Tabla_Pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private int id_pedido;

    // FK id_usuario
    @ManyToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id_usuario")
    @JsonBackReference
    private Usuario usuario;

    // FK id_tienda
    @ManyToOne
    @JoinColumn(name = "fk_tienda", referencedColumnName = "id_tienda")
    @JsonBackReference
    private Tienda tienda;

    @Column(name = "estado_pedido", length = 100, nullable = false)
    private EnumEstadoPedido estado_pedido;
    @Column(name = "fecha_pedido", length = 100, nullable = false)
    private Date fecha_pedido;
    @Column(name = "total_pedito", length = 100, nullable = false)
    private double total_pedido;

    public Pedido() {
    }

    public Pedido(int id_pedido, EnumEstadoPedido estado_pedido, Date fecha_pedido, double total_pedido) {
        this.id_pedido = id_pedido;
        this.estado_pedido = estado_pedido;
        this.fecha_pedido = fecha_pedido;
        this.total_pedido = total_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public EnumEstadoPedido getEstado_pedido() {
        return estado_pedido;
    }

    public void setEstado_pedido(EnumEstadoPedido estado_pedido) {
        this.estado_pedido = estado_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public double getTotal_pedido() {
        return total_pedido;
    }

    public void setTotal_pedido(double total_pedido) {
        this.total_pedido = total_pedido;
    }
}
