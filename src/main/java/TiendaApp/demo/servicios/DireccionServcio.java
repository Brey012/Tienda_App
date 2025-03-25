package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IDireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServcio {

    @Autowired
    private IDireccion repositorio;
}
