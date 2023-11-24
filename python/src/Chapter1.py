"""
This is Python's the main function. To recap: All the code inside the main function is executed when we run the file.
"""
if __name__ == '__main__':
    # We can use print("Your text here") to print stuff to the console
    print('Hello World')

    # On line 9, we declare a variable named "foo" and set it to 5. In Python, a type declaration is optional.
    foo = 5

    # We can append a type declaration to make the code more readable (but the type will not be enforced).
    foo_with_type: int = 5
    #            -----

    # Python is a "weakly-typed" language. Even though we tell the program that our variable is an integer,
    # nobody will stop us from assigning a different type of value such as a boolean. Although the program will still
    # try to run, it is best to avoid these kinds of "bad practices".
    foo_with_type = False
    #             -------

    # EXERCISE 1: ######################################################################################################
    # Create 2 variables named recipe and eggs
    # Initialize the values to 7 and 12 (It could be nice to include a type annotation)
    # Change the value of eggs by subtracting the amount of eggs in the recipe and print the result
    # The answer should be 5
    # TIP1: Remember that you can use print() to print stuff to the console

    # TODO: WRITE YOUR SOLUTION HERE
