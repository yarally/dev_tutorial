public class Chapter3 {
    /**
     * This is the main function (line 6), or actually in Java we call functions "methods".
     * You should know that this main method runs all the code within its scope when you execute this file :)
     */
    public static void main(String[] args) {
        // Actually, you have seen a second method already! The println method (line 8).
        System.out.println("Hello world");

        // The following block of code (lines 14-26) calculates the sum of all integers up to the values from foo and bar.
        // Notice that there is a lot of duplicate code because we really do the same thing 3 times.
        // * foo and bar are popular template variable names, you should not use them in real code
        System.out.println("Example 1:");
        int foo = 10;
        int bar = 5;

        int fooOut = 0;
        int barOut = 0;
        for (int i = 0; i < foo; i++) {
            fooOut = fooOut + i;
        }
        System.out.println(fooOut);
        for (int i = 0; i < bar; i++) {
            barOut = barOut + i;
        }
        System.out.println(barOut);

        // No let's look at an example where we achieve the same thing, but by using a method.
        // We moved the for-loop from above into a method named "sumSequence" (lines 66-73) and we "call" that method two times.
        System.out.println("Example 2:");
        int fooOut2 = sumSequence(foo); // First method call
        int barOur2 = sumSequence(bar); // Second method call
        System.out.println(fooOut2);
        System.out.println(barOur2);

        // Study the sumSequence method (lines 68-75), then come back here and continue
        // EXERCISE 1 //////////////////////////////////////////////////////////////////////////////////////////////////
        // First uncomment the code on line 43
        // Then create a method called "doACountDown" that returns nothing (void) and takes a single integer as input.
        // Finally, implement the method such that it prints all the numbers starting from the input up and until 0.
        // E.g. for the input number 3, the method should print 3, 2 and 1 on separate lines.
        System.out.println("Exercise 1:");
        //doACountDown(10); // Uncomment this line

        // EXERCISE 2 //////////////////////////////////////////////////////////////////////////////////////////////////
        // First uncomment the code on lines 51 and 52
        // Then create a method called "sumOrMultiply" that returns an int and takes 2 ints and 1 boolean as input.
        // If the value of the boolean is true, the method should return the sum of the two input integers (2+6=8).
        // If the value of the boolean is false, the method should return the product of the two input integers (2*6=12).
        System.out.println("Exercise 2:");
        //System.out.println(sumOrMultiply(2, 6, true)); // Uncomment this line
        //System.out.println(sumOrMultiply(2, 6, false)); // Uncomment this line
    } // End of the main method

    /**
     * To create our own method, we need to understand the building blocks that we discussed earlier.
     * 0: The first "public static" part says something about the access level of the method; You may ignore this for now
     * 1: Next we specify the return type of the method, in this case int. A method is able to return any of the simple
     * types that you have learned before and a lot more. It can even return nothing at all. In that case, the return type
     * would be "void" in java.
     * 2: Next comes the name of the method, this can be anything you want. In java, it is custom to write method names
     * in "camelCase". In other languages, other cases might be preferred, e.g. snake_case or PascalCase.
     * 3: The final building block is the input of the method. This particular method takes a single input parameter of
     * the integer type. You can add more input parameters to a method by separating them with comma's.
     * 4: At the end of the method, we need to "return" a value, so we can use it back where we called the method.
     * A void method does not need a return.
     */
    public static int sumSequence(int input) {
  //------0------ -1- -----2----- ----3----
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum = sum + i;
        }
        return sum; // 4: The return keyword is used to pass the value of sum back to where we called the method
    }

    // WRITE YOUR FIRST SOLUTION HERE //////////////////////////////////////////////////////////////////////////////
    // Remember to start your method with "public static"
    // TIP: Use i--; to decrement the value of your counter in a for-loop

    // WRITE YOUR SECOND SOLUTION HERE //////////////////////////////////////////////////////////////////////////////
    // Remember to start your method with "public static"
}
