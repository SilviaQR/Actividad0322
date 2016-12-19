import java.time.LocalDate;

/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
      private String nombre;
      private boolean tareaCompletada;
      private int prioridad;
      private LocalDate fechaInicio;


      public Tarea(String descripcion)
      {
          nombre = descripcion;
          tareaCompletada = false;
          prioridad = 0;
          fechaInicio = null;
      }
      
      public String getTarea(){
          return nombre;
      }
      
      public void marcarComoCompletada()
      {
          tareaCompletada = true;
      }
      
      public boolean tareaCompletada(){
          return tareaCompletada;
      }
      
      public String toString()
      {
          String textoADevolver = "";
          if(tareaCompletada){
              textoADevolver = textoADevolver + "HECHA ";
          }
          textoADevolver += nombre + " (" + "Prioridad: " + prioridad + "). ";
          return textoADevolver;
      }
      
      public void cambiarPrioridad(int establecerPrioridad){
          if(establecerPrioridad >= 0 && establecerPrioridad <= 5){
              prioridad = establecerPrioridad;
            }
      }
      
      public int getPrioridad(){
          return prioridad;
      }
      
      public void setFecha(int anio, int mes, int dia){
          fechaInicio = LocalDate.of(anio, mes, dia);
      }
          
      public LocalDate getFecha(){
          return fechaInicio;
      }
}
