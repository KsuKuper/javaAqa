//HW 7_2
public class Magazine implements Printable {

    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Magazine title: " + title);
    }
}
