if __name__ == '__main__':
    isFish = True

    # In python, the scope of a statement is managed through indentation. This is different from the curly braces
    # used in JAVA {}. We also barely need to use regular braces ()
    if isFish:
        print('It is a fish')
    else:
        print('It is not a fish')

    fishType: int = 0
    # This is a switch-statement, Python uses the syntax "match"
    # Notice python does not require Java's breaks and that the default case is created with an underscore (_)
    match fishType:
        case 0: print('It is a tuna')
        case 1: print('it is a salmon')
        case 2: print('it is a goldfish')
        case _: print('Is this even a fish?')

    # The value of i is automatically updated to the next value in this range.
    # A range is similar to a list, this one has the values 0, 1, 2, 3, 4, 5, 6, 7, 8 & 9
    for i in range(0, 10):
        print(f'This is iteration {i}')

    x: int = 100
    y: int = 50
    # The syntax for the while loop is very similar to the Java version.
    while x < y:
        print('x is still larger than y')
        x = x - 5

    # Because we don't use curly braces in Python, it is extra important to mind the correct indentation.
    # Look at this for loop a think about why it does not work as intended

    for i in range(0, 10):
        print("This is iteration: ")
    print(i)

    # For your exercises, you will try to refactor two pieces of code
    # 1: Change the if statement below to a switch statement

    color: str = 'RED'

    if color == 'GREEN':
        print("Drive")
    elif color == 'ORANGE':
        print("DRIVE FASTER")
    elif color == 'RED':
        print('Stop')
    else:
        print('Invalid color')

    # WRITE YOUR FIRST SOLUTION HERE (reuse the color variable, so you can compare the results)

    # 2: Change this while loop into a for loop instead

    i: int = 0
    even_sum: int = 0
    while i <= 48:
        # (%) is the modulo operator, this expression checks if i is an even number
        if i % 2 == 0:
            even_sum = even_sum + i
        i = i + 1
    print(even_sum)

    # WRITE YOUR SECOND SOLUTION HERE
    even_sum: int = 0



