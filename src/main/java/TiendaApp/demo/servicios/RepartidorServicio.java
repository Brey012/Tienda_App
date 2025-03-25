package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IRepartidor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepartidorServicio {

    @Autowired
    private IRepartidor repositorio;
}
