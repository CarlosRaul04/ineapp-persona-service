package pe.ineapp.ineapppersonaservice.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    @RequestMapping("/getALL")
    public List<Person> getAll(){

        //Person persona = new Person("Eduardo");
        LocalDate date = LocalDate.of(2004, Month.JANUARY, 3);

        Person person = Person.builder()
                .id(1L)
                .name("Carlos")
                .lastName("Ramirez")
                .dni("73777227")
                .email("carlos@gmail.com")
                .birthDate(date).build();

        return List.of(person) ;

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
