package TiendaApp.demo.servicios;

import TiendaApp.demo.modulos.Usuario;
import TiendaApp.demo.repositorios.IUsuario;
import jakarta.persistence.Id;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public List<Usuario> buscarUsuarios() throws Exception{
        try {
            return this.repositorio.findAll();
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    // Buscar por ID
    public Usuario buscarUsuarioId(Integer id_usuario) throws Exception{
        try {
            Optional<Usuario> usuarioBuscado = this.repositorio.findById(id_usuario);
            if (usuarioBuscado.isPresent()) {
                return usuarioBuscado.get();
            } else {
                throw new Exception("El usuario no esta en la base de datos");
            }
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    // Modificar por ID
    public  Usuario modificarUsuario(Integer Id, Usuario datosUsuario) throws Exception {
        try {
            Optional<Usuario> usuarioBuscado = this.repositorio.findById(id);
            if (usuarioBuscado.isPresent()) {
                usuarioBuscado.get().setTelefono_usuario(datosUsuario.getTelefono_usuario());

                return this.repositorio.save(usuarioBuscado.get());
            } else {
                throw new Exception("El usuario no esta en la base de datos");
            }
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    // Eliminar por ID
    public boolean eliminarUsuario(Integer id) throws Exception {
        try {
            Optional<Usuario> usarioBuscado = this.repositorio.findById(id);
            if (usarioBuscado.isPresent()) {
                this.repositorio.deleteAllById(id);
                return true;
            } else {
                throw new Exception("El usuario no esta en la base de datos");
            }
        } catch(Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
