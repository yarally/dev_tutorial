public class Chapter3 {
    // The main function, or actually java calls its functions "methods".
    // You now know that this method runs all the code within its scope when you execute this file :)
    public static void main(String[] args) {
        // Actually, you have seen a second method already! The println method that prints stuff to your terminal
        System.out.println("Hello world");

        // Examine the next block of code
        int a0 = 10;
        int b0 = 5;
        int c0 = 7;

        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        for (int i = 0; i < a0; i++) {
            a1 = a1 + i;
        }
        System.out.println(a1);
        for (int i = 0; i < b0; i++) {
            b1 = b1 + i;
        }
        System.out.println(b1);
        for (int i = 0; i < c0; i++) {
            c1 = c1 + i;
        }
        System.out.println(c1);

        // This code calculated the sum of natural numbers for the variables a0, b0, and c0. Notice that there is a lot of duplicate code because
        // we really do the same thing 3 times. No let's look at example where we use a method, this looks a lot cleaner, and it is also easier to understand.
        int a2 = sumSequence(a0);
        int b2 = sumSequence(b0);
        int c2 = sumSequence(c0);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
    }

    public static int sumSequence(int input) {
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
