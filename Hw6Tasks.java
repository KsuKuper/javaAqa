public class Hw6Tasks {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Candy", "Soligorsk", "Dog treats"),
                new Cat("Meow", "Istanbul", "Cat treats"),
                new Horse("Ivan", "Afina's village", "Horse treats"),
                new Parrot("Kesha", "Georgian's Zoo", "Seeds"),
        };
        Veterinarian veterinarian = new Veterinarian();
        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
            animal.eat();
        }
    }
}
