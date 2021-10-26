/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;
 

import tienda.entidades.Producto;
import excepcion.MiExcepcion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class ProductoDAO extends TiendaDAO {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mostrarTodo() throws SQLException{
           // 1 CREAR CONEXION CON DATOS De CONEXION AQUI MISMO
         Connection miConexion 
        = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda" , "root" , "root");
            
         // 2 Crear Objeto Statement
 Statement miStatement = miConexion.createStatement();
          // 4 EJECUTAR SQL Mostrar Todo
      ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM producto"); 
       //  Leer el ResultSet
       while(miResultSet.next()){
       System.out.println( miResultSet.getInt("codigo")+ " " + miResultSet.getString("nombre")+ " " + miResultSet.getDouble("precio"));
        }  
    }
    
    
    /// ABAJO USANDO LOS DATOS DE conexión de TiendaDAO, LLAMADO DESDE EL MAIN    
    public void mostrarTodo2() throws SQLException, MiExcepcion{
        conectarBase();
           
         // 2 Crear Objeto Statement
         sentencia = conexion.createStatement();
        
         // 4 EJECUTAR SQL Mostrar Todo
          resultado = sentencia.executeQuery("SELECT * FROM producto"); 
       
//  Leer el ResultSet
       while(resultado.next()){
       System.out.println( resultado.getInt("codigo")+ " " + resultado.getString("nombre")+ " " + resultado.getDouble("precio"));
        }  
    }

     public void ultimoCodigo() throws SQLException, MiExcepcion{
        conectarBase();
           
         // 2 Crear Objeto Statement
         sentencia = conexion.createStatement();
        
         // 4 EJECUTAR SQL Mostrar Todo
          resultado = sentencia.executeQuery("SELECT MAX(codigo) FROM producto"); 
       
//  Leer el ResultSet
        while(resultado.next()){
        System.out.println(resultado.getInt("MAX(codigo)"));
         }
       
         
    }

    public void guardarProducto(Producto producto) throws MiExcepcion, Exception {
        try {
            if (producto == null) {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
            
            int ultimoCodigo = ultimoProducto();
             ultimoCodigo = ultimoCodigo+1;
            // SENTENCIA SQL DE INSERCIÓN
        //    INSERT INTO producto VALUES(codigo, nombre, precio, codigo fabricante);
  
            String sql = "INSERT INTO producto(codigo, nombre, precio , codigo_fabricante) "        
                    + "VALUES('" + ultimoCodigo
                    + "', '" + producto.getNombre() + "', '" + producto.getPrecio()
                    + "', '" + producto. getCodigoFabricante() +  "');";

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL GUARDAR USUARIO");
        }
    }

    public void modificarProducto(Producto producto) throws MiExcepcion {
        try {
            if (producto == null) {
                throw new MiExcepcion("PRODUCTO INVÁLIDO");
            }
  
            // SENTENCIA SQL DE MODIFICACIÓN
              //   UPDATE `tienda`.`producto` SET `nombre`='Disco SSD 2 TB' WHERE `codigo`='3';
// UPDATE `tienda`.`producto` SET `nombre`='Memoria RAM DDR4 16GB', `precio`='220', `codigo_fabricante`='5' WHERE `codigo`='2';
            String sql = "UPDATE producto SET nombre = '"  
                     + producto.getNombre() + "' , precio= '" + producto.getPrecio()
                    + "', codigo_fabricante = '" + producto.getCodigoFabricante() + "' WHERE codigo = '" + producto.getCodigo()+"'; "  ;

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL MODIFICAR el PRODUCTO");
        }
    }

    public Producto buscarProductoPorCodigo() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            System.out.println("Que producto quiere buscar? Ingrese el código del mismo");
            int codigo = leer.nextInt();
            
            String sql = "SELECT * FROM producto WHERE codigo = '" + codigo + "';";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
               
            }
  
            return producto;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally {
            desconectarBase();
        }
    }

    public void eliminarProdcucto(Integer codigo) throws MiExcepcion {
        try {
            // SENTENCIA SQL DE ELIMINACIÓN
            String sql = "DELETE FROM producto WHERE codigo = '" + codigo + "';";

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL ELIMINAR PRODUCTO");
        }
    }
    
    public void masDeDoscientos() throws SQLException, MiExcepcion{
        
//         6 Mostrar productos cuyo precio es mayor a 200
             conectarBase();
         sentencia = conexion.createStatement();
         
         resultado = sentencia.executeQuery("SELECT * FROM producto WHERE precio > 200");
       // Leer
       while(resultado.next()){
        System.out.println( resultado.getInt("codigo")+ " " + resultado.getString("nombre")+ " " + resultado.getDouble("precio"));
     }
        
    }
     
    public void modificarProducto2() throws MiExcepcion, SQLException{
        
   //  7 Cambiar los datos de un producto
  // UPDATE `tienda`.`producto` SET `nombre`='GeForce GTX 1050Ti  NUEVA', `precio`='250' WHERE `codigo`='4';
 //Podría ser : "DELETE producto WHERE codigo='4'";
        System.out.println("Ingrese el nombre, precio y código de fabricante y codigo del producto que quiere cambiar");
        String nombre = leer.next();
                Double precio = leer.nextDouble();
        int codigo_fabricante = leer.nextInt();
     int codigo = leer.nextInt();
     conectarBase();
         sentencia = conexion.createStatement();
         
          String sql = "UPDATE producto SET nombre = '"  
                     + nombre + "' , precio= '" + precio
                    + "', codigo_fabricante = '" + codigo_fabricante + "' WHERE codigo = '" +codigo+"'; "  ;

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println(sql);
            System.out.println();
            insertarModificarEliminar(sql);
         
// String instruccionSQL = "UPDATE producto SET nombre =" + nombre + " , precio= " +precio+ " , codigo fabricante= " +codigo_fabricante+" WHERE codigo=" +codigo ;        
// sentencia.execute(instruccionSQL);
//             System.out.println("Datos modificados correctamente");
        
    }
    
     public void InsertarProducto() throws MiExcepcion, SQLException{
        
          int ultimoCodigo = ultimoProducto();
             ultimoCodigo = ultimoCodigo+1;
   //  7 Cambiar los datos de un producto
  // UPDATE `tienda`.`producto` SET `nombre`='GeForce GTX 1050Ti  NUEVA', `precio`='250' WHERE `codigo`='4';
 //Podría ser : "DELETE producto WHERE codigo='4'";
        System.out.println("Ingrese el nombre, precio y código de fabricante que quiere ingresar. El código de producto es automático");
        String nombre = leer.next();
                Double precio = leer.nextDouble();
        int codigo_fabricante = leer.nextInt();
   //  int codigo = leer.nextInt();
     conectarBase();
         sentencia = conexion.createStatement();
         
          String sql = "INSERT INTO producto(codigo, nombre, precio , codigo_fabricante) "        
                    + "VALUES('" + ultimoCodigo
                    + "', '" + nombre + "', '" + precio
                    + "', '" + codigo_fabricante +  "');";

            // SE MUESTRA LA CADENA RESULTANTE
            System.out.println("Producto insertado correcticamente, a saber:");
            System.out.println(sql);
            System.out.println();
            insertarModificarEliminar(sql);
         
// String instruccionSQL = "UPDATE producto SET nombre =" + nombre + " , precio= " +precio+ " , codigo fabricante= " +codigo_fabricante+" WHERE codigo=" +codigo ;        
// sentencia.execute(instruccionSQL);
//             System.out.println("Datos modificados correctamente");
        
    }
    
    public int ultimoProducto () throws MiExcepcion{
        
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT MAX(codigo) FROM producto";  

            consultarBase(sql);
            
            Integer ultimoCodigo = 0;
                     
            while (resultado.next()) {
                
                ultimoCodigo = resultado.getInt(1);
 
            }

            return ultimoCodigo;
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER el ULTIMO CODIGO");
        } finally {
            desconectarBase();
        }  
    }   
        
    public List<Producto> obtenerProducto() throws MiExcepcion {
        try {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto"; // "SELECT correo, nombre, apellido FROM usuario";

            consultarBase(sql);

            List<Producto> productos = new ArrayList<>();
            Producto producto = null;

            while (resultado.next()) {
                 producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                
                productos.add(producto);
            }
            System.out.println(productos);  // Esto es lo mismo que abajo, pero sirve cuando el metodo es un VOID
            return productos; // Esto es por si el método NO es un VOID
        } catch (SQLException | MiExcepcion e) {
            System.out.println(e.getMessage());
            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally {
            desconectarBase();
        }
    }
}
