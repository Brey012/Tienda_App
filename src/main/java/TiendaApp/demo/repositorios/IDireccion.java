package TiendaApp.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccion extends JpaRepository<IDireccion, Integer> {

}
