package Calculator_2;

import java.util.Scanner;

public class Calculator_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Maths Maths = new Maths();

        double answer = 0;
        double inputA, inputB;
        char operator;
        boolean done = false;

        while (!done) {
            inputA = scanner.nextDouble();
            operator = scanner.next().charAt(0);
            inputB = scanner.nextDouble();

            switch (operator) {
                case '+' -> answer = Maths.add(inputA, inputB);
                case '-' -> answer = Maths.subtract(inputA, inputB);
                case '*' -> answer = Maths.multiply(inputA, inputB);
                case '/' -> answer = Maths.divide(inputA, inputB);
                case '^' -> answer = Maths.power(inputA, inputB);
            }

            System.out.println(answer);
        }

        scanner.close();

    }

}
