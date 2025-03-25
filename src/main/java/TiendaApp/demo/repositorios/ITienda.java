package TiendaApp.demo.repositorios;

import TiendaApp.demo.modulos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITienda extends JpaRepository<Usuario, Integer> {
}
