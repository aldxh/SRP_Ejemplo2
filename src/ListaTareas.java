import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private static List<Tarea> tareas = new ArrayList<>();
    public static void agregarTarea(Tarea nuevaTarea){
        tareas.add(nuevaTarea);
    }

    public static void eliminarTarea(Tarea nuevaTarea){
        tareas.remove(nuevaTarea);
    }

    public static void mostrarTareas(){
        System.out.println("Lista de tareas: ");
        for(Tarea nuevaTarea: tareas){
            System.out.println(nuevaTarea.estaCompleta() ? "[X] " +
                    nuevaTarea.getTareaDescrip() : "[ ] " +
                    nuevaTarea.getTareaDescrip());
        }
    }
}
