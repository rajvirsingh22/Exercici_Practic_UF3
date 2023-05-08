package cat.ilg.m3.uf3;

public class Student {
    public String name = "";
    public int age;
    public int amountOfEnrolledSubjects;

    @Override
    public String toString(){
        return "Nombre: " + name + "\t\t" +
                "Edad: " + age + "\t\t" +
                "Assignatura: " + amountOfEnrolledSubjects;
    }
}

