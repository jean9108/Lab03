package edu.eci.cosw.spademo.controller;

import edu.eci.cosw.spademo.Service.TareaService;
import edu.eci.cosw.spademo.models.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.xml.ws.RequestWrapper;
import java.util.List;

/**
 * Created by Joana on 04/02/2017.
 */
@RestController
@RequestMapping("app")
public class TareasController {

    @Autowired
    TareaService service;

    @RequestMapping(value = "/tareas", method = RequestMethod.GET)
    public List<Tarea> getTareasPendientes(){
        return service.getTarea();
    }

    @RequestMapping(value = "/tareas", method = RequestMethod.POST)
    public ResponseEntity<Tarea> addTarea(@RequestBody Tarea t){
        System.out.println(t.getDescripcion()+" "+t.getPrioridad());
        service.addNewTarea(t);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
