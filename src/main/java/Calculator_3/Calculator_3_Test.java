package Calculator_3;

import java.text.DecimalFormat;
import java.util.*;

public class Calculator_3_Test {

    public static ArrayList<String> getValue(Scanner scanner) {
        String[] values = scanner.next().split("[*+-/\\s]");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i].length() == 0) {
                continue;
            } else {
                arrayList.add(values[i]);
            }
        }
        return arrayList;
    }

    public static ArrayList<String> getOperation(Scanner scanner) {
        String[] operation = scanner.next().split("[\\d\\s]");
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (String s : operation) {
            if (s.isEmpty()) {
            } else {
                arrayList2.add(s);
            }
        }
        return arrayList2;
    }

    public static void calculate(ArrayList<String> values, ArrayList<String> operation) {

        double result = 0;
        double first = Double.parseDouble(values.get(0));
        double second = Double.parseDouble(values.get(1));

        switch (operation.get(0)) {
            case "+" -> result = first + second;
            case "-" -> result = first - second;
            case "*" -> result = first * second;
            case "/" -> result = first / second;
        }
        System.out.println("Результат = " + String.format("%.3f", result));
    }

    public static void main(String[] args) {

        System.out.println("Start of calculation");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double result = 0;
            String s1 = scanner.nextLine();
            if (s1.isEmpty()) {
            } // для игнорирования пустой строки
            else if (s1.equals("/help")) {
                System.out.println("The program calculates the sum of numbers");
            } else if (s1.equals("/exit")) {
                System.out.println("Bye!");
                break;
            } else {
                String[] values = s1.split("[*+-/\\s]");
                ArrayList<String> arrayList = new ArrayList<>();
                for (int i = 0; i < values.length; i++) {
                    if (values[i].length() == 0) {
                        continue;
                    } else {
                        arrayList.add(values[i]);
                    }
                }

                String[] operation = s1.split("[\\d\\s]");
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (String s : operation) {
                    if (s.isEmpty()) {
                    } else {
                        arrayList2.add(s);
                    }
                }




                String s4 = Arrays.toString(operation);
//                char ch = s4.strip().charAt(3);
//                char[] s5 = s4.toCharArray();
//                for (char c : s5) {
//                    System.out.println(c);
//                }

                double first = Double.parseDouble(arrayList.get(0));
                double second = Double.parseDouble(arrayList.get(1));

                switch (arrayList2.get(0)) {
                    case "+" -> result = first + second;
                    case "-" -> result = first - second;
                    case "*" -> result = first * second;
                    case "/" -> result = first / second;
                }
            }

            System.out.println("Результат = " + new DecimalFormat("0.###").format(result));
        }
        scanner.close();
    }
    

}
