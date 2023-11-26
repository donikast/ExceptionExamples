package bg.tu_varna.sit.example3;

public class Application {
    public static void main(String[] args) {
        try {
            division(100, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("So wrong");
        } else {
            int c = a / b;
            System.out.println(c);
        }
    }
}

