package co.edu.central.co.gestormetodologiastareas.servicios;
import co.edu.central.co.gestormetodologiastareas.persistencia.entidades.Usuarios;
import co.edu.central.co.gestormetodologiastareas.persistencia.repositorios.UsuariosRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UsuariosServicios {
    UsuariosRepositorio usuarioRepositorio;

    public List<Usuarios> obtenerTodos(){
        List<Usuarios> listado = (List<Usuarios>) usuarioRepositorio.findAll();
        return listado;
    }
    public boolean borrar(Usuarios usuario){
        try{
            usuarioRepositorio.delete(usuario);
        }catch (Exception e){
            return false;
        }
        return true;
    }

}