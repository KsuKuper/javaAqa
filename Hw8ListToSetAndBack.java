import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hw8ListToSetAndBack {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("4");
        myList.add("5");

        System.out.println("Size of arrayList before changing list to set: " + myList.size());

        for (String element : myList) {
            System.out.println(element);
        }

        Set<String> mySet = new HashSet<>(myList);
        myList = new ArrayList<>(mySet);

        System.out.println("Size of arrayList after changing list to set and back: " + myList.size());

        for (String element : myList) {
            System.out.println(element);
        }
    }
}


