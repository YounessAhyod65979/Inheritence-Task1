import java.util.Scanner;

class Person {
    protected String Surname;
    protected String FirstName;
    protected String Street;
    protected String ZipCode;
    protected String City;

    public void initialize() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Surname:");

        Surname = scanner.nextLine();
        System.out.println("Enter First name:");
        FirstName = scanner.nextLine();

        System.out.println("Enter Street:");
        Street = scanner.nextLine();

        System.out.println("Enter Zip Code:");
        ZipCode = scanner.nextLine();

        System.out.println("Enter City:");
        City = scanner.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + Surname);

        System.out.println("First name: " + FirstName);

        System.out.println("Street: " + Street);

        System.out.println("Zip code: " + ZipCode);

        System.out.println("City: " + City);
    }
}

class Staff extends Person {
    private String education;
    private String position;

    public void initialize1() {

        initialize();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter education:");
        education = scanner.nextLine();

        System.out.println("Enter position:");
        position = scanner.nextLine();
    }

    public void print1() {
        print();

        System.out.println("Education: " + education);

        System.out.println("Position: " + position);
    }
}

public class Main {

    public static void main(String[] args) {

        Staff staff = new Staff();

        staff.initialize1();

        staff.print1();
    }
}
