package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEntrega extends JpaRepository<Entrega, Integer> {
}
