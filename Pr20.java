public class Pr20 {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two arguments");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Output:
java Division 10 2
Result: 5

java Division 10 0
Error: Cannot divide by zero

java Division 10
Error: Please provide two arguments

java Division a b
Error: Invalid number format
*/
