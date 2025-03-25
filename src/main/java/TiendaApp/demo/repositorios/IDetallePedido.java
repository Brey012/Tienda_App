package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetallePedido extends JpaRepository<DetallePedido, Integer> {
}
