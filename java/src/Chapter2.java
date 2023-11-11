public class Chapter2 {
    public static void main(String[] args) {

        // Here we declare a boolean variable and initialize it to true
        boolean isFish = true;

        // Currently, the if-branch will be triggered, you can try and trigger the else-branch
        if (isFish) {
            System.out.println("It is a fish");
        } else {
            System.out.println("It is not a fish");
        }

        // Now we look at a switch statement. The value of the variable below can represent several types of fish
        // Change the fishType value to look at the results for yourself
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

        // For loops in Java have 3 building blocks separated by ;
        // 1: We initialize a variable (typically named i) that keeps track of the number of iterations
        // 2: The condition to keep looping, this is in terms of i
        // 3: Some incrementation of i, in this example i++ which is equivalent to i = i + 1
        int iterations = 10;
        for (int i = 0; i < iterations; i++) {
            System.out.println("This is iteration: " + i);
        }

        // This is a while loop, the code block inside will keep running as long as the condition x > y is met
        int x = 100;
        int y = 50;
        while (x > y) {
            System.out.println("x is still larger than y");
            x = x - 5;
        }

        // Now try the following 2 exercises:
        // 1: Create a variable called sum and initialize it to 0. Write a for-loop that runs from 0 to 100 (inclusive)
        // and add these to your sum variable. Finally print the result (it should be 5050)
        // TIP: If your answer is 4950, think about what the final value of i is when your loop ends.

        //2: Create an integer variable (I will call it test) and set its value to 2.
        // Make a while-loop with the condition a != 1296. Inside the while, create an if-statement
        // multiply a by itself if it is currently less than 1000, otherwise subtract 65500 from test
        // If you did it correctly, you will not enter an infinite loop and your program should terminate :)

        // WRITE YOUR FIRST SOLUTION HERE

        // WRITE YOUR SECONDN SOLUTION HERE
    }
}
