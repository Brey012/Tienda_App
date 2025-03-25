package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

    @Autowired
    private IProducto repositorio;
}
