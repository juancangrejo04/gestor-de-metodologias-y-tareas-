package co.edu.central.co.gestormetodologiastareas.persistencia.repositorios;
import co.edu.central.co.gestormetodologiastareas.persistencia.entidades.Usuarios;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepositorio extends CrudRepository<Usuarios, String> {
}
