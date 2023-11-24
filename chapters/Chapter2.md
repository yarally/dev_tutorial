# Chapter 2 - Control Flow
In a programming language, control flow determines the order in which your lines of code are executed. Without any
special statements, the program is executed sequentially from the top to the bottom. In this chapter you will practice
with some of the most prevalent control flow statements.

## Branching statements
### If-Then-Else
You have probably heard of the if-then-else statement as it can be found virtually everywhere. Even excel has its own
implementation. The if-then-else statement allows for branching inside your code.
1. First we evaluate a condition in the _if_ part
2. If the condition was met, the code in the _then_ part is executed
3. Otherwise, the code in the _else_ part is executed.

```
(pseudo code)

if condition
    Execute A
else
    Execute B
```
Notice that A en B can never be executed both.

### Switch
Another form of branching can be accomplished by using a switch-statement. A switch-statement evaluates a single
expression and then executes one of manny branches if the label matches. This is useful when an expression can
have multiple, predictable values. Take this example with a variable named _animal_ that can take the values CAT, DOG
and FISH:
```
(pseudo code)
switch animal
    case CAT
        Execute A
    case DOG
        Execute B
    case FISH
        Execute C
```

Notice that the same functionality could be achieved with a if-then-else statement, but this is a bit more verbose:

```
(pseudo code)
if animal is CAT
    Execute A
else if animal is DOG
    Execute B
else if animal is FISH
    Execute C
```

## Loops
### For-Loop (count-controlled loop)
The for-loop is used to repeat a block of code for a fixed number of times. The for-loop often uses a variable that we
call a counter. This counter is incremented at the end of every iteration.

```
(pseudocode)
for i in the range 0 up to 10
    Execute A
```

### While-Loop (condition-controlled loop)
The while loop takes a condition and will repeat its block of code as long as the condition evaluates to true. Notice that
if coded incorrectly it is possible that the while loop will keep running forever, causing your program to crash! This
is called: _an infinite-loop_

```
(pseudocode)
while condition
    Execute A
```

## Scope
Each statement has its own "scope". In Java, the scope is created with curly braces "{ }", while Python uses indentation
to determine the scope. Variables that are declared inside a certain scope are not accessible by parts of the program from
a higher scope. Take the example below. This program has an outer scope and an inner scope. From the outer scope, the only
variable that is accessible is Variable A. However, from within the inner scope, both Variable A and Variable B are
accessible.

```
(pseudo code)
{
    Variable A
    print(A)
    {
        Variable B
        print(A)
        print(B)
    }
    print(A) <-- we just closed the inner scope with "}" and are back in the outer scope
}
```

## Exercise
Do the exercises below
* [Java exercise](../java/src/Chapter2.java)
* [Python exercise](../python/src/Chapter2.py)