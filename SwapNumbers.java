public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Print before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        // Print after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
