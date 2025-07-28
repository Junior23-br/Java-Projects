import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GroupTest {
    @Test
    /*
    Se verifica con test de prueba con 5 personas,
    solo dos cumplen la condicion minima de letras del nombre
     */
    public void caseOne() {
        //Dado
        Persona juan = new Persona("Juan", 22);
        Persona pedro = new Persona("Pedro", 32);
        Persona ana = new Persona("Ana", 23);
        Persona luz = new Persona("Luz", 21);
        Persona julian = new Persona("Julian", 35);
        Group group = new Group();

        //Cuando
        group.addPeople(juan);
        group.addPeople(pedro);
        group.addPeople(ana);
        group.addPeople(luz);
        group.addPeople(julian);

        //Entonces -> tmñ 2
        Assertions.assertTrue(group.getPeople().size() ==2 );
    }
}
