package ejercicio;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //cerciorar que la persona sea mayor de 18 años.
    public boolean isOlder(){
        return age>=18;
    }

    //cerciorar que el nombre de la persona tenga mas de 4 letras
    public boolean letterName(){
        return name.length()> 4;
    }

    //cerciorar que la edad de la persona sea entre 0 y 120
    public boolean ageCheck(){

        boolean check = false;

        if (age>0 && age<=120){
            check =true;
        }
        return check;
    }

    //cerciorar que el nombre solo contenga letras de la A a la Z.

    public boolean nameAZcheck(){

        boolean check = false;

        char [] nameToChars = name.toCharArray(); // crear el array nameToChars y colocar dentro name convertido en chars

        for (char letters: nameToChars){ // creamos una variable para guardar cada char del array nameToChars mientras lo recorremos
            if (!Character.isLetter(letters)){ // utilizamos la clase Character y utilizamos el metodo .isLetter en letters
                return check; // devuelve falso
            }
        }
        check = true; // cambiamos check de false a true
        return check; // en caso de que no se cumpla la condicion del if devuelve true

    }

}
