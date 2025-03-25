package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IEntrega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntregaServicio {

    @Autowired
    private IEntrega repositorio;
}
