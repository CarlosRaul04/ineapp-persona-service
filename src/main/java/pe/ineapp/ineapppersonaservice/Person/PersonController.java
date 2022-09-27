package pe.ineapp.ineapppersonaservice.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
//PREGUNTA 4
    @GetMapping
    @RequestMapping("/get2Alumnos")
    public List<Person> getAll(){

        //Person persona = new Person("Eduardo");
        LocalDate date = LocalDate.of(2004, Month.JANUARY, 3);
        LocalDate date2 = LocalDate.of(2004, Month.MARCH, 7);
        LocalDate date3 = LocalDate.of(1999, Month.APRIL, 7);

        Person person = Person.builder()
                .id(1L)
                .name("Carlos")
                .lastName("Ramirez")
                .dni("73777227")
                .email("carlos@gmail.com")
                .birthDate(date).build();

        Person person2 = Person.builder()
                .id(2L)
                .name("Giulliano")
                .lastName("Cuentas")
                .dni("73745644")
                .email("giulliano@gmail.com")
                .birthDate(date2).build();

        Person person3 = Person.builder()
                .id(3L)
                .name("Alejandro")
                .lastName("Monzon")
                .dni("32165498")
                .email("ale@gmail.com")
                .birthDate(date3).build();


        return List.of(person,person2,person3) ;

    }

    @RequestMapping("/getByid")
    public Person getByid(){
        LocalDate date = LocalDate.of(2004, Month.JANUARY, 3);

        Person person = Person.builder()
                .id(1L)
                .name("Carlos")
                .lastName("Ramirez")
                .dni("73777227")
                .email("carlos@gmail.com")
                .birthDate(date).build();

        return person;
    }

    //PUT




    //POST




    //DELETE



}
