
public class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
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

    //Verificar que la persona sea mayor de 18 años
    public Boolean isOlder() {
        return age >= 18;
    }

    //Verificar que el nombre contenga 5 o ams letras
    public boolean nameCheck() {
        return name.length() > 4;
    }

    //Verificar que su edad este entre 0 y 120
    public boolean ageCheck() {
        boolean check = false;
        if (age > 0 && age < 120) {
            check = true;
        }
        return check;
    }

    //Verificar los caracteres validos del name
    public boolean nameAZCheck() {
        boolean check = false;
        char [] nameToChars = name.toCharArray(); //Se convierte en char el name
        for (char letra : nameToChars) {
            if (!Character.isLetter(letra)) {
                return check;
            }
        }

        check = true;
        return true;
    }


}

