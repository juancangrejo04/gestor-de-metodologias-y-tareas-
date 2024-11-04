package co.edu.central.co.gestormetodologiastareas.controladores;
import co.edu.central.co.gestormetodologiastareas.persistencia.entidades.Usuarios;
import co.edu.central.co.gestormetodologiastareas.servicios.UsuariosServicios;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;
@AllArgsConstructor
@Controller
public class UsuariosControlador {

    UsuariosServicios usuariosServicios;

    public List<Usuarios> obtenerTodos() {
        return usuariosServicios.obtenerTodos();
    }
}