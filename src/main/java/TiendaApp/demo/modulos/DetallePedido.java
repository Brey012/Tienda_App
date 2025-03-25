package TiendaApp.demo.modulos;

import jakarta.persistence.*;

@Entity
@Table(name = "DetallePedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detallePedido")
    private int id_detalle_pedido;

    // FK id_pedido

    // FK id_producto

    @Column(name = "cantidad_producto", length = 100, nullable = false)
    private int cantidad_producto;
    @Column(name = "precio_producto", length = 100, nullable = false)
    private double precio_producto;

    public DetallePedido() {
    }

    public DetallePedido(int id_detalle_pedido, int cantidad_producto, double precio_producto) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.cantidad_producto = cantidad_producto;
        this.precio_producto = precio_producto;
    }

    public int getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public void setId_detalle_pedido(int id_detalle_pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }
}
