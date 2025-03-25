package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.ITienda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TiendaServicio {
    @Autowired
    private ITienda repositorio;
}
