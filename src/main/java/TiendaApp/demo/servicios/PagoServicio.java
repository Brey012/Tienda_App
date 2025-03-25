package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoServicio {
    @Autowired
    private IPago repositorio;
}
