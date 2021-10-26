/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import excepcion.MiExcepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import tienda.persistencia.TiendaDAO;
import java.util.Scanner;

 
public class Tienda {
 
    
    public static void main(String[] args) throws MiExcepcion, Exception {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoDAO menu = new ProductoDAO();
        Producto objProducto = new Producto(0, "prueba47", 77, 1);

        try {

            // 1 CREAR CONEXION   
            Connection miConexion
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "root");

            // 2 Crear Objeto Statement
            Statement miStatement = miConexion.createStatement();

            //  menu.guardarProducto(objProducto);
            
            // OBTENER PRODUCTO desde ARRAY
            // menu.obtenerProducto(); //Si anda, pero es leyendo un array desde el mismo método que abajo
          //  System.out.println(menu.obtenerProducto());   // Anda, pero es ToString, leyendo un array dos veces en el método
            //   menu.ultimoProducto(); //No ANDA NO ES VOID
           // System.out.println(menu.ultimoProducto());  // AQUI SI ANDA, PORQUE NO ES VOID, ES lo mismo que la linea arriba
           
            // ULTIMO CODIGO
          //  menu.ultimoCodigo();

            //MOSTRAR TODO
           menu.mostrarTodo();
//            System.out.println("");
//            menu.mostrarTodo2(); // este es con los datos de TiendaDAO

           // ULTIMO PRODUCTO
             System.out.println(menu.ultimoProducto());
             
             //MOSTRAR MAS DE DOSCIENTOS
            //menu.masDeDoscientos();
            
            // MODIFICAR PRODUCTO
          //menu.modificarProducto(objProducto); // NO ANDA BIEN;
          
          // Guardar producto nuevo
            //  menu.guardarProducto(objProducto); // NO ANDA BIEN
            
            // INGRESAR PRODUCTO NUEVO
             // menu.InsertarProducto();
             
             
            //BUSCAR PRODUCTO
          //  System.out.println(menu.buscarProductoPorCodigo());
            //   menu.modificarProducto2(); // ESTE ANDA BIEN
          
            // menu.mostrarTodo2();
            //  menu.guardarProducto(objProducto); No se de donde toma datos para guardar, pero se autoincrementa el codigo llave primaria

            // 3 INSTRUCCION SQL  para insertar   
            // El código de fabricante debe ser uno existente
            // El código del producto debe ser uno a continuación del último
            //Se puede ver el último código con el paso 5 más abajo
            // String instruccionSQL = "INSERT INTO producto( codigo, nombre, precio , codigo_fabricante  ) VALUES ( 25 , 'tecladitoss', 79 , 8  )";
            //  miStatement.executeUpdate(instruccionSQL);
            //    System.out.println("Datos ya insertados");
       
            //   4 EJECUTAR SQL Mostrar Todo
//      ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM producto"); 
//       //  Leer el ResultSet
//       while(miResultSet.next()){
//       System.out.println( miResultSet.getInt("codigo")+ " " + miResultSet.getString("nombre")+ " " + miResultSet.getDouble("precio"));
//        }
//             System.out.println(" ");
////        5 Ejecutar MaximoCódigo y Leer
//        ResultSet miResultSet2 = miStatement.executeQuery("SELECT MAX(codigo) FROM producto");
////        Leer
//           while(miResultSet2.next()){
//        System.out.println(miResultSet2.getInt("MAX(codigo)"));
//         }
            // 6 Mostrar productos cuyo precio es mayor a 200
//             System.out.println(" ");
//    ResultSet miResultSet3 = miStatement.executeQuery("SELECT * FROM producto WHERE precio > 200");
//       // Leer
//       while(miResultSet3.next()){
//        System.out.println( miResultSet3.getInt("codigo")+ " " + miResultSet3.getString("nombre")+ " " + miResultSet3.getDouble("precio"));
//     }
            //  7 Cambiar los datos de un producto
            // UPDATE `tienda`.`producto` SET `nombre`='GeForce GTX 1050Ti  NUEVA', `precio`='250' WHERE `codigo`='4';
            //Podría ser : "DELETE producto WHERE codigo='4'";
//String instruccionSQL = "UPDATE producto SET nombre ='GeForce GTX 1050Ti  NUEVA' , precio=250 WHERE codigo='4'";        
//miStatement.execute(instruccionSQL);
//             System.out.println("Datos modificados correctamente");
//
////             // leer lo que quedó
//  ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM producto");       
////    //  Leer el ResultSet
//      while(miResultSet.next()){
//       System.out.println( miResultSet.getInt("codigo")+ " " + miResultSet.getString("nombre")+ " " + miResultSet.getDouble("precio"));
//        }
//       
            // BORRAR PRODUCTO
//String instruccionSQL2 = "DELETE FROM producto WHERE codigo='22'";   
//miStatement.execute(instruccionSQL2);
//             System.out.println("Datos modificados correctamente");
//
//             // leer lo que quedó
//ResultSet miResultSet5 = miStatement.executeQuery("SELECT * FROM producto");       
//    //  Leer el ResultSet
//       while(miResultSet5.next()){
//       System.out.println( miResultSet5.getInt("codigo")+ " " + miResultSet5.getString("nombre")+ " " + miResultSet5.getDouble("precio"));
//        }       
        } catch (Exception e) {
            System.out.println("No conecta");
            e.printStackTrace();
        }

        // TODO code application logic here
    }

}
