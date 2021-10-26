/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import excepcion.MiExcepcion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends TiendaDAO {
    
//    public void guardarFabricante(Fabricante fabricante) throws MiExcepcion, Exception {
//        try {
//            if (fabricante == null) {
//                throw new MiExcepcion("USUARIO INVÁLIDO");
//            }
//
//            // SENTENCIA SQL DE INSERCIÓN
//        //    INSERT INTO producto VALUES(codigo, nombre, precio, codigo fabricante);
//        
//   
//            String sql = "INSERT INTO usuario(codigo, nombre, precio , codigoFabricante) "        
//                    + "VALUES('" + fabricante.getCodigo()
//                    + "', '" + fabricante.getNombre() + "', '" + fabricante.getPrecio()
//                    + "', '" + fabricante. getCodigoFabricante() +  "');";
//
//            // SE MUESTRA LA CADENA RESULTANTE
//            System.out.println(sql);
//            System.out.println();
//
//            insertarModificarEliminar(sql);
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//            throw new MiExcepcion("ERROR AL GUARDAR USUARIO");
//        }
//    }
//
//    public void modificarProducto(Producto producto) throws MiExcepcion {
//        try {
//            if (producto == null) {
//                throw new MiExcepcion("PRODUCTO INVÁLIDO");
//            }
//
//            // SENTENCIA SQL DE MODIFICACIÓN
//              //   UPDATE `tienda`.`producto` SET `nombre`='Disco SSD 2 TB' WHERE `codigo`='3';
//// UPDATE `tienda`.`producto` SET `nombre`='Memoria RAM DDR4 16GB', `precio`='220', `codigo_fabricante`='5' WHERE `codigo`='2';
//            String sql = "UPDATE producto SET nombre = '"  
//                     + producto.getNombre() + "' , precio= '" + producto.getPrecio()
//                    + "', codigo_fabricante = '" + producto.getCodigoFabricante() + "' WHERE codigo = '" + producto.getCodigo()+"'; "  ;
//
//            // SE MUESTRA LA CADENA RESULTANTE
//            System.out.println(sql);
//            System.out.println();
//
//            insertarModificarEliminar(sql);
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//            throw new MiExcepcion("ERROR AL MODIFICAR USUARIO");
//        }
//    }
//
//    public Producto buscarUsuarioPorCodigo(Integer codigo) throws MiExcepcion {
//        try {
//            // SENTENCIA SQL DE CONSULTA
//            String sql = "SELECT * FROM producto WHERE codigo = '" + codigo + "';";
//
//            consultarBase(sql);
//
//            Producto producto = null;
//
//            while (resultado.next()) {
//                producto = new Producto();
//
//                producto.setNombre(resultado.getString(1));
//                producto.setPrecio(resultado.getInt(2));
//                producto.setCodigoFabricante(resultado.getInt(3));
//            }
//
//            return producto;
//        } catch (SQLException | MiExcepcion e) {
//            System.out.println(e.getMessage());
//            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
//        } finally {
//            desconectarBase();
//        }
//    }
//
//    public void eliminarUsuario(Integer codigo) throws MiExcepcion {
//        try {
//            // SENTENCIA SQL DE ELIMINACIÓN
//            String sql = "DELETE FROM producto WHERE codigo = '" + codigo + "';";
//
//            // SE MUESTRA LA CADENA RESULTANTE
//            System.out.println(sql);
//            System.out.println();
//
//            insertarModificarEliminar(sql);
//        } catch (MiExcepcion e) {
//            System.out.println(e.getMessage());
//            throw new MiExcepcion("ERROR AL ELIMINAR PRODUCTO");
//        }
//    }
//
//    public List<Producto> obtenerUsuarios() throws MiExcepcion {
//        try {
//            // SENTENCIA SQL DE CONSULTA
//            String sql = "SELECT * FROM usuario"; // "SELECT correo, nombre, apellido FROM usuario";
//
//            consultarBase(sql);
//
//            List<Producto> productos = new ArrayList<>();
//            Producto producto = null;
//
//            while (resultado.next()) {
//                 producto = new Producto();
//
//                producto.setNombre(resultado.getString(1));
//                producto.setPrecio(resultado.getInt(2));
//                producto.setCodigoFabricante(resultado.getInt(3));
//
//                productos.add(producto);
//            }
//
//            return productos;
//        } catch (SQLException | MiExcepcion e) {
//            System.out.println(e.getMessage());
//            throw new MiExcepcion("ERROR AL OBTENER PRODUCTO");
//        } finally {
//            desconectarBase();
//        }
//    }
    
}
