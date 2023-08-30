package repassem_POO;

public class ex01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Ana";
        p1.age = 21;
        p1.gender = "Female";

        p2.name = "Maria";
        p2.age = 24;
        p2.gender = "Female";

        System.out.println("Person 1: ");
        System.out.println("Name: " + p1.name + ".");
        System.out.println("Age: " + p1.age + ".");
        System.out.println("Gender: " + p1.gender + ".");

        System.out.println("Person 2: ");
        System.out.println("Name: " + p2.name + ".");
        System.out.println("Age: " + p2.age + ".");
        System.out.println("Gender: " + p2.gender + ".");
    }
}
