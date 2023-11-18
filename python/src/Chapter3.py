# So this is our main method (line 3), ehh now we call them functions again...
# This function is called from the weird if __name__ == '__main__' statement at the bottom of the file
def main():
    # You are already familiar with the print function (line 5), we use this to show stuff in the terminal
    print('Hello world')

    # As with variables, in python there is not need to specify the types of your input parameters or return value
    # Look at the two functions on lines 29 and 43. They do the same thing, but only one uses type annotations
    print(sum_sequence_1(10))
    print(sum_sequence_2(10))

    # Study the sum_sequence methods (lines 29 and 43) before you continue
    # EXERCISE 1: Move the code below into a function and print the result #############################################
    base: int = 5  # First input
    power: int = 3  # Second input
    result: int = base  # Return variable
    for i in range(power - 1):
        result = result * base
    print(result)

    # Call the function you created here, make sure it is in the scope of the main function
    # ...
# End of the main function


# This function calculates the sum of all natural numbers from 0 until the input parameter. Because the type annotations
# are lacking, it is important to write comments and use good variable names so that other people can understand what
# the code does. Here, I did not necessarily do a great job at that.
def sum_sequence_1(inp):
    res = 0
    for i in range(inp):
        res = res + i
    return res


# It's easier to identify the building blocks for functions when we include the type annotations.
# 0: Any function in python starts with the "def" keyword, which is short for "define"
# 1: The name of the function can be anything (as long as you haven't used it before). The python standard is to use
# snake_case for function names
# 2: The input parameters of the function are separated by comma's. The type annotation comes after the name.
# 3: The return type of the function comes after the input parameters, preceded by a ->.
# 4: Python also uses the keyword "return" to return a value from a function.
def sum_sequence_2(inp: int) -> int:
# 0- -------1------ ----2---  ---3---
    res: int = 0
    for i in range(inp):
        res = res + i
    return res

# WRITE YOUR SOLUTION HERE #############################################################################################


if __name__ == '__main__':
    main()
