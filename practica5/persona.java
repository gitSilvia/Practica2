package practica5;
/**
 * practica5
 * @author Silvia Chamorro
 * 
 * 
*/
public class persona{
  protected String nombre;
   private int edad;
   public persona(String nombre,int edad){
    this.nombre = nombre;
    this.edad = edad;
   }
   public String getNombre(){
    return this.nombre;
   }
   public int getEdad(){
     return edad;
   }
  
   public void mostrarDatos(){
    System.out.println("Nombre: "+nombre);
 
   }
}