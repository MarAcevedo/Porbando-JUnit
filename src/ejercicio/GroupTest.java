package ejercicio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GroupTest {

    @Test
    public void caseOne(){

       Person Juan = new Person("Juan", 22);
       Person Pedro = new Person("Pedro",32);
       Person Ana = new Person("Ana", 23);
       Person Luz = new Person("Luz",21);
       Person Julian = new Person("Julian",35);
       Group group = new Group ();

       group.addPerson(Juan);
       group.addPerson(Pedro);
       group.addPerson(Ana);
       group.addPerson(Luz);
       group.addPerson(Julian);

        Assertions.assertTrue(group.getPeople().size() == 2);


    }
    @Test
    public void caseTwo(){

        Person Juana = new Person("Juana", 18);
        Person Pedro = new Person("Pedro",17);
        Person Analia = new Person("Analia", 22);
        Person Luciana = new Person("Luciana",14);
        Person Julian = new Person("Julian",32);
        Group group = new Group ();

        group.addPerson(Juana);
        group.addPerson(Pedro);
        group.addPerson(Analia);
        group.addPerson(Luciana);
        group.addPerson(Julian);

        Assertions.assertTrue(group.getPeople().size() == 3);

    }

    @Test

    public void caseThree(){
        Person Nicolas = new Person("N1c0las", 18);
        Person Tomas = new Person("Tomas",18);
        Person Esteban = new Person("Est3ban", 22);
        Person Carlos = new Person("Carlos%%5v",18);
        Person Francisco = new Person("Fr@ncisc/o",32);
        Group group = new Group ();

        group.addPerson(Nicolas);
        group.addPerson(Tomas);
        group.addPerson(Esteban);
        group.addPerson(Carlos);
        group.addPerson(Francisco);

        Assertions.assertEquals(1,group.getPeople().size());

    }

}
