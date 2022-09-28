import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int old = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            File file = new File("INPUT.txt");
            Scanner scanner = new Scanner(file);
            String d = scanner.nextLine();
            a = Integer.parseInt(d);
            d = scanner.nextLine();
            b = Integer.parseInt(d);
            d = scanner.nextLine();
            c = Integer.parseInt(d);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                a = Integer.parseInt(data);
                int num = a + b + c;
                System.out.println("A: " + a + " B: " + b + " C: " + c + " NUM: " + num + " OLD: " + old);
                if (num > old) {
                    counter += 1;
                }
                c = b;
                b = a;
                old = num;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(c);
    }
}
