package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServicio {

    @Autowired
    private IPedido repositorio;
}
