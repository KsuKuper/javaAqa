public class Parrot extends Animal {

    private String name;

    public Parrot(String name, String location, String food) {
        super(location, food);
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("The parrot is " + name + " make noise: Chirp Chirp");
    }

    @Override
    public void eat() {
        System.out.println("The cat is " + name + " eat " + getFood() + ".");
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }
}