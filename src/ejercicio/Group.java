package ejercicio;

import java.util.ArrayList;
import java.util.List;
public class Group {
    private List<Person> people;

    public Group() {
        people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public void addPerson (Person person){
        boolean isOlder = person.isOlder();
        boolean letterName = person.letterName();
        boolean ageCheck = person.ageCheck();
        boolean nameAZCheck = person.nameAZcheck();

        if(isOlder && letterName && ageCheck && nameAZCheck){

            people.add(person);
            System.out.println("Se agrego una persona: " + person.getName() + " de edad " + person.getAge());
        }else{
            if(!isOlder ) System.err.println("La persona " + person.getName() + " debe ser mayor de 18 años");
            if(!letterName) System.err.println("La persona " + person.getName() + " no pudo ser agregada por que su nombre tiene menos de 5 letras");
            if (!ageCheck) System.err.println("La persona " + person.getName() + " no puede ser mayor a 120 años o ser menor a 0");
            if (!nameAZCheck) System.err.println("La persona " + person.getName() + " no puede tener simbolos ni numeros en el nombre");

        }

    }
}
