import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String tareaDescrip;
    private boolean tareaComplet;


    public Tarea(String tareaDescrip){
        this.tareaDescrip = tareaDescrip;
        this.tareaComplet = false;
    }

    public String getTareaDescrip(){
        return tareaDescrip;
    }

    public void marcarComplet(){
        tareaComplet = true;
    }

    public boolean estaCompleta(){
        return tareaComplet;
    }

}
