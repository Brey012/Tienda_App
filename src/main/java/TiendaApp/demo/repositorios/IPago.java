package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPago extends JpaRepository<Pago, Integer> {
}
