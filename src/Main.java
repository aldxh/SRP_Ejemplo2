public class Main {
    public static void main(String[] args) {
        ListaTareas lTareas = new ListaTareas();

        Tarea t1 = new Tarea("Hacer diapositivas");
        Tarea t2 = new Tarea("Hacer memes de pino");
        lTareas.agregarTarea(t1);
        lTareas.agregarTarea(t2);

        lTareas.mostrarTareas();
        t2.marcarComplet();
        lTareas.mostrarTareas();
    }
}
