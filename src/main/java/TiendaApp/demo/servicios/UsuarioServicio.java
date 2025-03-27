package TiendaApp.demo.servicios;

import TiendaApp.demo.modulos.Usuario;
import TiendaApp.demo.repositorios.IUsuario;
import jakarta.persistence.Id;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {
    @Autowired
    private IUsuario repositorio;

    //Listar los metodos que activaran las consultas en la BD

    // Guardar
    public Usuario guadarUsuario(Usuario datosUsuario) throws Exception {
        try {
            // Validar los datos de entrada
            return this.repositorio.save(datosUsuario);
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    // Buscar Registros

    // Buscar por ID

    // Modificar por ID

    // Eliminar por ID
}
