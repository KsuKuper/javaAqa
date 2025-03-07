import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw9Exeptions {

    // Метод, который использует throw
    public static String readWithThrows() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = reader.readLine();
        reader.close();
        return t;
    }

    // Метод, который использует try-catch-finally
    public static String readWithTryCatchFinally() {
        BufferedReader reader = null;
        String tcf = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            tcf = reader.readLine(); // Может выбросить IOException
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close(); // Закрываем ресурс, если он не был null
                } catch (IOException e) {
                    System.err.println("Ошибка при закрытии ресурса: " + e.getMessage());
                }
            }
        }
        return tcf;
    }

    // Метод, который использует try-with-resources
    public static String readWithTryWithResources() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine(); // Может выбросить IOException
        } catch (IOException e) {
            System.err.println("Ошибка ввода-вывода: " + e.getMessage());
            return null; // Возвращаем null в случае ошибки
        }
    }

    public static void main(String[] args) {
        // Чтение с использованием throws
        try {
            System.out.println("Введите строку (метод с throws): ");
            String result1 = readWithThrows();
            System.out.println("Вы ввели: " + result1);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении строки: " + e.getMessage());
        }

        // Чтение с использованием try-catch-finally
        System.out.println("Введите строку (метод с try-catch-finally): ");
        String result2 = readWithTryCatchFinally();
        System.out.println("Вы ввели: " + result2);

        // Чтение с использованием try-with-resources
        System.out.println("Введите строку (метод с try-with-resources): ");
        String result3 = readWithTryWithResources();
        System.out.println("Вы ввели: " + result3);
    }
}



