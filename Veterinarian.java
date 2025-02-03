public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Animal is located on " + animal.getLocation());
        System.out.println("Kind of eat: " + animal.getFood());
        animal.makeNoise();
    }
}
