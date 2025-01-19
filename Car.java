public class Car {
    double speed;
    double timeToSprint100;
    double timeBrake;
    final String brandName;

    public Car(double speed, double timeToSprint100, double timeBrake, String brandName) {
        this.speed = speed;
        this.timeToSprint100 = timeToSprint100;
        this.timeBrake = timeBrake;
        this.brandName = brandName;
    }

    public void displayInfoCar() {
        System.out.println("Brand's car name: " + brandName);
        double timeDifference = timeToSprint100 - timeBrake;
        System.out.println("Difference between time to sprint and time to brake: " + timeDifference);
        boolean areEqual = (timeToSprint100 == timeBrake);
        System.out.println("Time to sprint and time to brake are equal: " + areEqual);
    }
}
