public class Chapter2 {
    public static void main(String[] args) {

        // On line 5 we declare a boolean variable and initialize it to true
        boolean isFish = true;

        // Let's look at an if-statement
        // Currently, the if-branch will be triggered, you may try and trigger the else-branch
        if (isFish) {
            System.out.println("It is a fish");
        } else {
            System.out.println("It is not a fish");
        }

        // Now we look at a switch statement. The value of the variable on line 17 can represent several types of fish
        // Change the fishType value and examine the output of the switch-statmentn
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
        // For-loops in Java have 3 building blocks separated by a ";"
        // 1: We initialize a variable (typically named i) that keeps track of the number of iterations
        // 2: The condition to keep looping, this is in terms of i
        // 3: Some incrementation of i, in this example i++ which is equivalent to i = i + 1, this happens at the end of a loop
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            //1:------ 2:------------- 3:--
            System.out.println("This is iteration: " + i);
        }

        // And finally, this is a while loop
        // The code block inside the curly braces will keep running as long as the condition x > y is met
        int x = 100;
        int y = 50;
        while (x > y) {
            System.out.println("x is still larger than y");
            x = x - 5;
        }

        // Now try the following 2 exercises:
        // EXERCISE 1 //////////////////////////////////////////////////////////////////////////////////////////////////
        // Create a variable called sum and initialize it to 0. Write a for-loop that runs from 0 to 100 (inclusive)
        // and add the values of your iterator to the sum variable. This means that the value of sum will look like
        // 0 + 1 + 2 + 3... Finally print the result (it should be 5050)
        // TIP: If your answer is 4950, think about what the final value of i is when your loop ends.

        // EXERCISE 2 //////////////////////////////////////////////////////////////////////////////////////////////////
        // Create an integer variable (I will call it test) and set its value to 2.
        // Make a while-loop with the condition test != 1296. Inside the while, create an if-statement
        // multiply test by itself if it is currently less than 1000, otherwise subtract 65500 from test
        // If you did it correctly, you will not enter an infinite loop and your program should terminate :)

        // WRITE YOUR FIRST SOLUTION HERE //////////////////////////////////////////////////////////////////////////////

        // WRITE YOUR SECOND SOLUTION HERE /////////////////////////////////////////////////////////////////////////////
    }
}