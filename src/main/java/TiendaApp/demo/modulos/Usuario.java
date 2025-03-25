package TiendaApp.demo.modulos;

import TiendaApp.demo.Enums.EnumUsuario;
import jakarta.persistence.*;

@Entity
@Table(name="Tabla_Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int id_usuario;

    @Column(name = "nombre_usuario", length = 100, nullable = false)
    private String nombre_usuario;
    @Column(name = "email_usuario", length = 100, nullable = false)
    private String email_usuario;
    @Column(name = "password_usuario", length = 100, nullable = false)
    private String password_usuario;
    @Column(name = "telefono_usuario", length = 100, nullable = false)
    private String telefono_usuario;
    @Column(name = "tipo_usuario", length = 100, nullable = false)
    private EnumUsuario tipo_usuario;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre_usuario, String email_usuario, String password_usuario, String telefono_usuario, EnumUsuario tipo_usuario) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.email_usuario = email_usuario;
        this.password_usuario = password_usuario;
        this.telefono_usuario = telefono_usuario;
        this.tipo_usuario = tipo_usuario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public EnumUsuario getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(EnumUsuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}
