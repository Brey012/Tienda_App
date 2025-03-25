package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IDetallePedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServicio {

    @Autowired
    private IDetallePedido repositorio;
}
