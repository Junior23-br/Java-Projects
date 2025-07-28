import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class GroupTest {

    /*
    Se verifica con test de prueba con 5 personas,
    solo dos cumplen la condicion minima de letras del nombre
     */
    @Test
    @Disabled
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
    @Test
    
    public void caseTwo() {

        //Dado
        Persona juana = new Persona("Juana", 18);
        Persona pedrito = new Persona("Pedrito", 17);
        Persona analia = new Persona("Analia", 22);
        Persona luciana = new Persona("Luciana", 14);
        Persona daniel = new Persona("Daniel", 32);
        Group grupo = new Group();
        //Cuando
        grupo.addPeople(juana);
        grupo.addPeople(pedrito);
        grupo.addPeople(analia);
        grupo.addPeople(luciana);
        grupo.addPeople(daniel);

        //Entonces tmñ -> 3
        Assertions.assertTrue(grupo.getPeople().size() == 3);

    }


}
