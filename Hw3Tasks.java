public class Hw3Tasks {
    public static void main(String[] args) {
        Engineer qa = new Engineer("Ksu", "Kuper", "QA", 100);
        qa.displayInfoEngineer();
        Engineer developer = new Engineer("Aleksandr", "Ivanov", "DEV", 1000);
        developer.displayInfoEngineer();
        Car honda = new Car(200.00, 8.0, 8.0, "Honda");
        honda.displayInfoCar();
        Car toyota = new Car(250.00, 6.5, 4.0, "Toyota");
        toyota.displayInfoCar();
    }
}
