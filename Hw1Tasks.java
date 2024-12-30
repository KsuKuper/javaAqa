public class Hw1Tasks {
    public static void main(String[] args) {
        printNumWithIf();
        printNumWithSwitch();
        calculateEvenSum();
    }

    public static void printNumWithIf() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("one");
            } else if (i == 2) {
                System.out.println("two");
            } else if (i == 3) {
                System.out.println("three");
            } else if (i == 4) {
                System.out.println("four");
            } else {
                System.out.println("five");
            }
        }
    }

    public static void printNumWithSwitch() {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                default:
                    break;
            }
        }
    }

    public static void calculateEvenSum() {
        int sum = 0;
        int i = 10;
        while (i <= 55) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Total sum numbers from 10 to 55: " + sum);
    }
}
