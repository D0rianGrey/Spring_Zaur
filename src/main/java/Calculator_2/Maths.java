package Calculator_2;

public class Maths {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double power(double a, double b) {
        double answer = a;

        for (int x = 2; x <= b; x++) {
            answer *= a;
        }

        return answer;
    }
}
