/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesej6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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
public class Mapas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashMap<Integer , String> tienda = new HashMap();
    public String producto;
    public Integer key;
  

    public Mapas() {
    }

    public Mapas(String producto, Integer key ) {
        this.producto = producto;
        this.key = key;
         
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }
 
    
    public void ingresarProductos (){
 
         String rta;
  
        do {            
             System.out.println("Ingrese la clave de un producto y el producto."); // key es el precio
            key = leer.nextInt();
             producto = leer.next();             
      
            tienda.put(key, producto);
 
         rta = null;
            System.out.println("Quiere agregar otro producto? s / n");
             rta = leer.next();
             
             if (!rta.equals("s") && !rta.equals("n") ) {
                 System.out.println("Ingrese una respuesta válida");   
            }
          
    } while (!"n".equals(rta));
        
    }
 
    public void mostrarProductos (){
        
        for (Map.Entry<Integer, String> aux : tienda.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
           // double precio = aux.getPrecio ();
            System.out.println("Producto: " +value +" ---Key o Precio: $" +key);
        }
            
    }
    
    public void eliminarProducto () {
        System.out.println("Ingrese la Key del objeto que desea eliminar");
        key = leer.nextInt();
        
        tienda.remove(key);
        System.out.println(" ");
        System.out.println("Los productos sin el objeto borrado son los siguientes: ");
          for (Map.Entry<Integer, String> aux : tienda.entrySet()) {
            Integer key = aux.getKey();
            String value = aux.getValue();
           // double precio = aux.getPrecio ();
            System.out.println("Producto: " +value +" ---  Key o Precio: $" +key);
        }
    }
        
}
