public class Chapter2 {
    public static void main(String[] args) {

        boolean isFish = true;

        // Let's look at an if-statement
        // Because we initialized the variable on line 4 with the value "true", our program should now execute the code
        // inside the if-branch (line 10). What could you do if you wanted to trigger the else branch instead?
        if (isFish) {
            System.out.println("It is a fish");
        } else {
            System.out.println("It is not a fish");
        }

        // Next we look at a switch statement. The value of the variable on line 17 can represent several types of fish
        // Change the fishType value and examine the output of the switch-statement
        int fishType = 0;

        switch (fishType) {                             // We evaluate the variable in the switch
            case 0:                                     // We execute this branch if the evaluation matches the value 0
                System.out.println("It is a tuna");     // We print the type of fish
                break;                                  // In Java, we need to "Break" out of the switch statement to stop further evaluation
            case 1:
                System.out.println("It is a salmon");
                break;
            case 2:
                System.out.println("It is a goldfish");
                break;
            default:                                    // The default case is triggered if all of the above branches did not evaluate
                System.out.println("Is this even a fish?");
        }

        // Next up is the for-loop
        // For-loops in Java consist of 3 building blocks separated by a ";"
        // 1: We initialize a counter variable (typically named i) that keeps track of the number of iterations
        // 2: The condition to keep looping, this is in terms of i
        // 3: Some incrementation of i, in this example i++ which is equivalent to i = i + 1, this happens at the end of an iteration
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            //----1---- -------2------- -3-
            System.out.println("This is iteration: " + i);
        }

        // And finally, this is a while loop
        // The code block inside the curly braces will keep running as long as the condition x > y evaluates to true
        int x = 100;
        int y = 50;
        while (x > y) {
            System.out.println("x is still larger than y");
            x = x - 5;
        }

        // EXERCISE 1 //////////////////////////////////////////////////////////////////////////////////////////////////
        // Create a variable called sum and initialize it to 0. Write a for-loop that runs from 0 to 100 (inclusive)
        // and add the values of your counter to the sum variable. This means that the value of sum will look like:
        // 0 + 1 + 2 + 3...
        // Finally print the result (it should be 5050)
        // TIP1: If your answer is 4950, think about what the final value of i is when your loop ends.

        // EXERCISE 2 //////////////////////////////////////////////////////////////////////////////////////////////////
        // Create an integer variable (I will call it foo) and set its value to 2.
        // Make a while-loop with the condition foo != 1296. Inside the while, create an if-statement.
        // Multiply foo by itself if foo is currently less than 1000, otherwise subtract 65500 from foo.
        // If you did it correctly, your program should finish quickly.

        // TODO: WRITE YOUR FIRST SOLUTION HERE ////////////////////////////////////////////////////////////////////////

        // TODO: WRITE YOUR SECOND SOLUTION HERE ///////////////////////////////////////////////////////////////////////
    }
}