package bg.tu_varna.sit.example1;

public class Application {
    public static void main(String[] args) {
        int[] array = new int[2];
        try {
            System.out.println(array[5]);
            System.out.println("After");
            // }
            //catch (ArrayIndexOutOfBoundsException e) {
            } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("In ArrayIndexOutOfBoundsException");
            }
      catch (Exception e) {
            e.printStackTrace();
            System.out.println("In Exception");
        }
        finally {
            System.out.println("This will printing ever.");
        }
    }
}
