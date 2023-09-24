import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/")
    public List<Alumno> obtenerTodosLosAlumnos() {
        return alumnoService.consultarTodosLosAlumnos();
    }

    @PostMapping("/")
    public void crearAlumno(@RequestBody Alumno alumno) {
        alumnoService.persistirAlumno(alumno);
    }

    @PutMapping("/{id}")
    public Alumno actualizarAlumno(@PathVariable Long id, @RequestBody Alumno alumnoActualizado) {
        return alumnoService.actualizarAlumno(alumnoActualizado);
    }

    // Otros métodos del controlador
}
