/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.Entidades;
import com.sun.istack.internal.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
/**
 *
 * @author LEOPOLDO
 */
@Entity
public class Editorial  {
    
    @Id 
    @GeneratedValue // (strategy =  IDENTITY)   // el valor se va a auto generar
    private String ID;
    
     @NotNull
     @Column(unique = true)
    private String nombre;
    
    private Boolean alta;

    public Editorial() {
    }

    public Editorial(String ID, String nombre, Boolean alta) {
        this.ID = ID;
        this.nombre = nombre;
        this.alta = alta;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Autor{" + "ID=" + ID + ", nombre=" + nombre + ", alta=" + alta + '}';
    }
    
    
    
}
