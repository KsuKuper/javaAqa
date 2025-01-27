public class Sun {

    public static int numberOfSunrise = 0;

    public void sunrise() {
        numberOfSunrise++;
        System.out.println("The Sun has risen");
    }

    public void displayNumberOfSunrise() {
        System.out.println("The Sun has risen " + numberOfSunrise + " times");
    }
}
