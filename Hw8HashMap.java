import java.util.HashMap;
import java.util.Map;

public class Hw8HashMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Java", 1);
        myMap.put("C++", 5);
        myMap.put("Python", 2);
        myMap.put("JS", 1);

        printInfo(myMap);
        printKey(myMap);
        printValue(myMap);
    }

    public static void printInfo(Map<String, Integer>map) {
        System.out.println("All maps data: ");
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    public static void printKey(Map<String, Integer>map) {
        System.out.println("All keys of map: ");
        for(String key: map.keySet()) {
            System.out.println(key);
        }
        System.out.println();
    }

    public static void printValue(Map<String, Integer>map) {
        System.out.println("All values of map: ");
        for(Integer value: map.values()) {
            System.out.println(value);
        }
        System.out.println();
    }
}
