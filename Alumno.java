import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

}

public interface AlumnoService {
    List<Alumno> consultarTodosLosAlumnos();
    void persistirAlumno(Alumno alumno);
    Alumno actualizarAlumno(Alumno alumno);
}

