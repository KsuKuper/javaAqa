//HW3

public class Engineer {
    String name;
    String surname;
    String position;
    int salary;

    public Engineer(String name, String surname, String position, int salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public void displayInfoEngineer() {
        System.out.println("Engineer's name: " + name + "\n" + "Engineer's surname: " + surname + "\n" + "Engineer's position: " + position + "\n" + "Engineer's salary: " + salary + "\n");
    }
}
