//HW5

public class StringMethods {
    public void methodString(String input) {
        System.out.println("String input: " + input);

        String lastIndex = input.substring(11);
        System.out.println("Substring from index 11 - " + lastIndex);

        String lastCharacter = String.valueOf(input.charAt(input.length() - 1));
        System.out.println("Last character in the input phrase - " + lastCharacter);

        String containJava = String.valueOf(input.contains("Java"));
        System.out.println("The phrase `I like Java!` contains word `Java` - " + containJava);

        String replaceFromAtoO = input.replace("a", "o");
        System.out.println("At the phrase `I like Java!` replaces all letters from `a` to `o` - " + replaceFromAtoO);

        System.out.println(input.toUpperCase());

        System.out.println(input.toLowerCase());

        System.out.println(input.substring(7, 11));

        int startIndex = input.indexOf("Java");
        int endIndex = startIndex + "Java".length();
        String extractedSubstring = input.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + extractedSubstring);

        String modifiedString = input.replace("Java", "");
        System.out.println("String after removing `Java`: " + modifiedString);
    }

    public static void methodCake() {
        String cake = "biscuit %s biscuit";
        System.out.println(String.format(cake, "cream"));
    }
}
