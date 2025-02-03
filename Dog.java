public class Dog extends Animal {

    private String name;

    public Dog(String name, String location, String food) {
        super(location, food);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog is " + name + " make noise: Bark Bark");
    }

    @Override
    public void eat() {
        System.out.println("The dog is " + name + " eat " + getFood() + ".");
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
