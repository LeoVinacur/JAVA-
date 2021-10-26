 
package coleccionesej6;
  
/**
 *6 Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
public class ColeccionesEj6 {

    //////Una pregunta: Si el ejercicio dice que la llave es el nombre del producto. 
    ////Puedo ponerle un double a la parte de precio? O tiene que ser si o si un Integer? 
    ////Por ejemplo, un producto que sale $8.50.
 ////Entonces se me ocurre otra pregunta más: Puedo ponerle tres elementos al Mapa? : Llave, producto, precio?
     
    //Respuesta:
    
///Leopoldo: podes ponerle Double (con mayúscula) yo lo hice así:
///Map<String, Double> productos = new HashMap();
///Tres elementos creo que NO... es llave(key) y valor(value)
    
    public static void main(String[] args) {
        
        Mapas m = new Mapas ();
        
        m.ingresarProductos();
        
        m.mostrarProductos();
        
        m.eliminarProducto();
        
        // TODO code application logic here
    }
    
}
