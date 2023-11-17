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
...Execute A
else
...Execute B
```
Notice that A en B can never be executed both.

### Switch
Another form of branching can be accomplished by using a switch-statement. A switch-statement evaluates a single
expression and then executes one of multiple branches that matches the label. This is useful when an expression can
have multiple, predictable values. Take this example with a variable named _animal_ that can take the values CAT, DOG
and FISH:
```
(pseudo code)
switch animal
...case CAT
......Execute A
...case DOG
......Execute B
...case FISH
......Execute C
```

Notice that the same functionality could be achieved with a large if-then-else statement:

```
(pseudo code)
if animal is CAT
...Execute A
else if animal is DOG
...Execute B
else if animal is FISH
...Execute C
```

## Loops
### For-Loop (count-controlled loop)
The for-loop is used to repeat a block of code for a fixed number of times. We often keep track of a variable that
is incremented after each iteration of the loop until we reach the desired value.

```
(pseudo code)
for i in the range 0 to 10
...Execute A
```

### While-Loop (condition-controlled loop)
The while loop takes a condition and will repeat its block of code as long as condition evaluates to true. Notice that
if coded incorrectly it is possible that the while loop will keep running forever, causing your program to crash!

```
(pseudo code)
while condition
...Execute A
```

## Exercise
Do the exercises below
* [Java exercise](../java/src/Chapter2.java)
* [Python exercise](../python/src/Chapter2.py)