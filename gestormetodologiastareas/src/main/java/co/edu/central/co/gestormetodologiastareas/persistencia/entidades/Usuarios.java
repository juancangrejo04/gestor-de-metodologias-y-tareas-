package co.edu.central.co.gestormetodologiastareas.persistencia.entidades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "usuario")
@Entity
public class Usuarios {

    @Id
    @Column(name = "nombre_usuario")
    public String usuario;
    @Column(name = "contrasena_usuario")
    public String contrasena;

}