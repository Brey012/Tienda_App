package TiendaApp.demo.servicios;

import TiendaApp.demo.repositorios.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    private IUsuario IUsuario;
}
