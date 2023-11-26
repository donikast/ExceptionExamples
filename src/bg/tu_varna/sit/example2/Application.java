package bg.tu_varna.sit.example2;

public class Application {
    public static void main(String[] args) {
        try {
            division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("You can’t divide by zero!");
            System.out.println(e.getMessage());
        }
    }

    public static void division(int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println(c);
    }
}

