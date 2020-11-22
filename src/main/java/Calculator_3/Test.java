package Calculator_3;

import java.util.ArrayList;
import java.util.Scanner;

import static Calculator_3.Calculator_3_Test.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = getValue(scanner);
        ArrayList<String> operation = getOperation(scanner);

        calculate(values, operation);
    }
}
