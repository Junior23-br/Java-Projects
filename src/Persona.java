
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
        return age > 18;
    }

    //Verificar que el nombre contenga 5 o ams letras
    public Boolean nameCheck() {
        return name.length() >= 5;
    }

    //Verificar que su edad este entre 0 y 120
    public Boolean ageCheck() {
        Boolean check = false;
        if (age > 0 && age < 120) {
            check = true;
        }
        return check;
    }

    //Verificar los caracteres validosd del name
    public Boolean nameAZCheck() {
        Boolean checkName = false;
        char[] nameToChars = name.toCharArray();
        for (char letter : nameToChars) {
            if (Character.isLetter(letter)) {
                return false;
            }
        }

        checkName = true;
        return true;
    }


}

