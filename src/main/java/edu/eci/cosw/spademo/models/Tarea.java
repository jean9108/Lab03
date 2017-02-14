package edu.eci.cosw.spademo.models;

/**
 * Created by Joana on 04/02/2017.
 */
public class Tarea {
    private  String descripcion;
    private  Integer prioridad;

    public Tarea(){

    }

    public Tarea(Integer prioridad, String descripcion){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public Integer getPrioridad(){
        return prioridad;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setPrioridad(Integer prioridad){
        this.prioridad = prioridad;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}
