import java.util.ArrayList;
import java.time.LocalDate;
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
        Tarea tarea = new Tarea(nuevaTarea);
        listaDeTareas.add(tarea);
    }
     
    public void verTareasNumeradas(){
        int numeroPosicion = 1;
        for(Tarea tarea : listaDeTareas){
            if(tarea.getFecha() == null){
                System.out.println(numeroPosicion + ". " + tarea.toString() + "No existe fecha límite de entrega.");
                numeroPosicion++;
           }
           else{
                System.out.println(numeroPosicion + ". " + tarea.toString() + "Fecha límite de entrega: " + tarea.getFecha());
                numeroPosicion++;
            }
        }  
    }
    
    public void marcarCompletada(int posicionTarea){
        int posicionReal = posicionTarea - 1;
        if(posicionReal >= 0 && posicionReal < listaDeTareas.size()){
            listaDeTareas.get(posicionReal).marcarComoCompletada();
            
        }
    }
    
    public void mostrarCoincidentes(String textoABuscar)
    {
        int contador = 0;
        while(contador < listaDeTareas.size()){
            Tarea tareaActual = listaDeTareas.get(contador);
            if(tareaActual.getTarea().contains(textoABuscar)){
               System.out.println((contador + 1) + tareaActual.toString());
            }
        }
        contador++;
    }
        
    public void eliminarTarea(int posicionTarea)
    {
        int posicionReal = posicionTarea - 1;
        if(posicionReal >= 0 && posicionReal < listaDeTareas.size()){
            listaDeTareas.remove(posicionReal);
        }
    }
    
    public void establecerPrioridad(int tarea, int establecerPrioridad){
        int tareaReal = tarea - 1;
        if(tareaReal >= 0 && tareaReal < listaDeTareas.size()){
            if(establecerPrioridad >= 0 && establecerPrioridad <= 5){
                listaDeTareas.get(tareaReal).cambiarPrioridad(establecerPrioridad);
            }
        }
    }
    
    public void setFechaLimite(int numeroTarea, int anio1, int mes1, int dia1){
        int contador = numeroTarea - 1;
        if(numeroTarea >= 0  &&  numeroTarea < listaDeTareas.size()){
            listaDeTareas.get(contador).setFecha(anio1, mes1, dia1);
        }
    }
}

    

