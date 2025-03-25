package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.Producto;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface IProducto extends JpaRepository<Producto, Integer> {
}
