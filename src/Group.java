import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Persona> people;
    public Group() {
        people = new ArrayList<Persona>();
    }
    public void addPeople(Persona person) {
        boolean isOlder= person.isOlder();
        boolean nameCheck = person.nameCheck();
        boolean nameAZCheck = person.nameAZCheck();
        boolean ageCheck = person.ageCheck();

        if(isOlder && nameCheck && nameAZCheck && ageCheck) {
            people.add(person);
            System.out.println("Se agrego una persona:  " + person.getName());
        }
        else {
            System.err.println("La persona " + person.getName() +" No cumple para agregar");
            if(!isOlder) System.err.println("La edad es inferior a la permitida");
            if(!nameCheck) System.err.println("El nombre debe contener más de 4 letras");
            if(!nameAZCheck) System.err.println("El nombre debe contener solo letras");

        }
    }

    public List<Persona> getPeople() {
        return people;
    }

    public void setPeople(List<Persona> people) {
        this.people = people;
    }

}
