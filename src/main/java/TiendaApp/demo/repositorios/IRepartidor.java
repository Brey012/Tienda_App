package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.Repartidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepartidor extends JpaRepository<Repartidor, Integer> {
}
