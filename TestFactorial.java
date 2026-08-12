public class TestFactorial {

    public static void main(String[] args) {
        int result = Factorial.factorial(5);

        if (result == 120) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
