import java.util.ArrayList;
/**
 * Write a description of class ListaDeTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaDeTareas
{
    // instance variables - replace the example below with your own
    private ArrayList<Tarea> listaDeTareas;

    public ListaDeTareas(){
        listaDeTareas = new ArrayList<Tarea>();
        
    }
    
    public void crearTarea(String nuevaTarea){
        Tarea tareaNueva = new Tarea(nuevaTarea);
        listaDeTareas.add(tareaNueva);
    }
}
