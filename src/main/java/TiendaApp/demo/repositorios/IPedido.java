package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.Pedido;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;

@ReadingConverter
public interface IPedido extends JpaRepository<Pedido, Integer> {
}
