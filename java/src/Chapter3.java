public class Chapter3 {
    // The main function (line 4), or actually java calls its functions "methods".
    // You now know that this method runs all the code within its scope when you execute this file :)
    public static void main(String[] args) {
        // Actually, you have seen a second method already! The println method (line 6).
        System.out.println("Hello world");

        // Examine the next block of code (lines 11-29)
        // It calculates the sum of natural numbers for the variables a0, b0, and c0.
        // Notice that there is a lot of duplicate code because we really do the same thing 3 times.
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

        // No let's look at example where we use a method, this looks a lot cleaner, and it is also easier to understand.
        // We moved the for-loop into a method called "sumSequence" (lines 68-75) and use that method three times.
        int a2 = sumSequence(a0);
        int b2 = sumSequence(b0);
        int c2 = sumSequence(c0);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);

        // Study the sumSequence method (lines 68-75) before you continue
        // EXERCISE 1 //////////////////////////////////////////////////////////////////////////////////////////////////
        // First uncomment the code on line 46
        // Create a method called "doACountDown" that returns nothing and takes a single integer as input.
        // The method should print all the numbers starting from the input until 0
        // E.g. for the input number 3, the method should print 3, 2 and 1 on separate lines.
        //doACountDown(10); // Uncomment this line

        // EXERCISE 2 //////////////////////////////////////////////////////////////////////////////////////////////////
        // First uncomment the code on lines 53 and 54
        // Create a method called "sumOrMultiply" that returns an int and takes 2 ints and 1 boolean as input.
        // If the value of the boolean is true, the method should return the sum of the two input integers (2+6=8).
        // If the value of the boolean is false, the method should return the product of the two input integers (2*6=12).
        //System.out.println(sumOrMultiply(2, 6, true)); // Uncomment this line
        //System.out.println(sumOrMultiply(2, 6, false)); // Uncomment this line
    } // End of the main method

    // To create our own method, we need to understand the building blocks that we discussed earlier.
    // 0: The first "public static" part says something about the access level of the method; You may ignore this for now
    // 1: Next we specify the return type of the method, in this case int. A method is able to return any of the simple
    // types that you have learned before and a lot more. It can even return nothing at all. In that case, the return type
    // would be "void" in java.
    // 2: Next comes the name of the method, this can be anything you want. In java, it is custom to write method names
    // in "camelCase". In other languages, other cases might be preferred, e.g. snake_case or PascalCase.
    // 3: The final building block is the input of the method. This particular method takes a single input parameter of
    // the integer type. You can add more input parameters to a method by separating them with comma's.
    // 4: At the end of the method, we need to "return" a value, so we can use it back where we called the method.
    // A void method does not need a return.
    public static int sumSequence(int input) {
  //------0------ -1- -----2----- ----3----
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum = sum + i;
        }
        return sum; // 4: The return keyword is used to pass the value of sum back to where we called the method
    }

    // WRITE YOUR FIRST SOLUTION HERE //////////////////////////////////////////////////////////////////////////////

    // WRITE YOUR SECOND SOLUTION HERE //////////////////////////////////////////////////////////////////////////////
}
