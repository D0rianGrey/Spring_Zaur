package Calculator_3;

import java.util.Date;
import java.util.Scanner;

public class Calculator_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int result = 0;
            String s1 = scanner.nextLine();
            if (s1.isEmpty()) {
            } // для игнорирования пустой строки
            else if (s1.equals("/help")) {
                System.out.println("The program calculates the sum of numbers");
            } else if (s1.equals("/exit")) {
                System.out.println("Bye!");
                break;
            } else {
                String[] s2 = s1.split(" ");
                for (String s : s2) {
                    int a = Integer.parseInt(s);
                    result += a;
                }
                System.out.println(result);
            }
        }
    }
}
