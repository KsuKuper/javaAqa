public class Hw7Tasks {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 4);
        triangle.display();
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("JAVA");
        printableItems[1] = new Book("JS");
        printableItems[2] = new Magazine("Science magazine");
        printableItems[3] = new Magazine("National geographic");
        for (Printable item : printableItems) {
            item.print();
        }
    }
}