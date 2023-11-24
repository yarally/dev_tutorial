/**
 * "Public class Chapter1" is a class declaration. We will discuss classes later in the course
 */
public class Chapter1 {

    /**
     * For now, we put all the code that we write inside the "main method" (declared on line 10). This is a special
     * block of code that gets executed when we run this file.
     */
    public static void main(String[] args) {
        // Use System.out.println("Your text here"); to print stuff to the console
        System.out.println("Hello world!");

        // On line 17, we create our first variable.
        // In Java, you start with type annotation followed by the variable's name.
        // This variable is named "foo" and it is of the type "int" (integer)
        int foo;

        // We can assign different values to this variable as long as they are integers
        // If we try to assign anything other than an integer to this variable, the program will fail
        foo = 5;
        foo = 3;

        // uncomment the line below and try to run the program (
        // foo = true;

        // It is also possible to assign a value to a variable when you declare it
        boolean bar = true;
        //          -------

        // EXERCISE 1 //////////////////////////////////////////////////////////////////////////////////////////////////
        // Create 2 integer variables named nrOfQuestions and nrOfCorrectAnswers
        // Initialize the values to 60 and 20
        // Print the test score calculated as nrOfCorrectAnswers / nrOfQuestions * 100
        // The answer should be 33.3333...
        // TIP1: Java always returns a whole number if you divide two integers. Change one of the numbers to a float.
        // TIP2: Remember that you can use System.out.println() to print stuff to the console

        // TODO: WRITE YOUR SOLUTION HERE
    }

}