package edu.eci.cosw.spademo.Service;

import edu.eci.cosw.spademo.models.Tarea;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Joana on 04/02/2017.
 */
@Service
public class TareaService {
    private static final List<Tarea> tareas = new LinkedList<Tarea>();
    public void addNewTarea(Tarea ta){
        tareas.add(ta);
    }

    public List<Tarea> getTarea(){
        return tareas;
    }

}
