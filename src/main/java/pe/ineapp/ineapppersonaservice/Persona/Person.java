package pe.ineapp.ineapppersonaservice.Persona;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;


@Data
@Builder
public class Person {
    @GeneratedValue
    @Id
    Long id;
    String name;
    String lastName;
    String dni;
    String email;
    LocalDate birthDate;



/*    String nombre;

    //constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public Persona(){

    }

    //getters and setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
*/
}
