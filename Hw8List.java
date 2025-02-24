import java.util.ArrayList;
import java.util.List;

public class Hw8List {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("4");
        myList.add("5");

        System.out.println("Size of arrayList: " + myList.size());

        for (String element : myList) {
            System.out.println(element);
        }

        removeDuplicates(myList);

        System.out.println("Size of arrayList after removing: " + myList.size());

        for (String element : myList) {
            System.out.println(element);
        }

        boolean isAdded = myList.add("10");

        if (myList.contains("10")) {
            System.out.println("The value 10 was successfully added to myList: " + isAdded);
        }

        System.out.println("Size of arrayList: " + myList.size());

        String userInput = "5";

        if (myList.contains((userInput))) {
            System.out.println("The value " + userInput + " is already in the list. It won't be added again.");
        } else {
            myList.add(userInput);
            System.out.println("The value " + userInput + " has been added to the list.");
        }

        System.out.println("Size of arrayList: " + myList.size());

        for (String element : myList) {
            System.out.println(element);
        }
    }

    private static void removeDuplicates(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String currentElement = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
                if (currentElement.equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
    }
}

