# Chapter 3 - Functions
Functions are self-contained pieces of code that can easily be used from different places. In the previous chapters you have already seen a special
kind of function: The main function. Most programming languages have some kind of main function. All the code inside the main function is executed
when the file is executed. Let's look at some examples in different languages:
```java
// java
public static void main(String[] args) {
    // Do stuff        
}
```
```python
# python
if __name__ == '__main__':
    # Do stuff
```
```rust
// rust
fn main() {
    // Do stuff
}
```
```java
// c++
int main() { 
    // Do stuff
}
```

Notice that the python syntax for the main function is a tiny bit strange compared to the rest. It is pretty common to include an actual function here
as well:
```python
def main():
    # Do stuff

if __name__ == '__main__':
    main()

```

So the main function is special because it always runs when you start your program, but other than that it is no different from other functions. We
can define our own functions to accomplish basically everything. Let's look at the building blocks. A function often starts with a name, a list of zero
or more input parameters and the type of the output. Suppose we define a function named "f" that adds two numbers. In this case, there are two input
parameters of the number type, and the output is also a number:
```
f(x, y) = x + y
```

## Scope
Just like loops and branching statements, functions have their own contained scope. Variables declared inside a function
can only be used inside that function unless you choose to return their value.

```
(pseudocode)
main() {
....variable a
....for {
........variable b
........#1
....}
....myFunction()
....#2
}

myFunction() {
....variable c
....#3
}
```
Look at the pseudocode above. At the #1 marker, you would be able to use the values of both variables a and b, but not c.
_b_ because we are in the scope of the for-loop, and _a_ because the for-loop is in the scope of the main function.
From marker #2 we would only be able to access variable _a_. The function "myFunction" has its own scope, so from marker
#3, we can only access variable c.

## Exercise
Functions are powerful because they reduce code duplication and improve the readability. To fully appreciate this, you have to play around with them.
Do the exercises below.
* [Java exercise](../java/src/Chapter3.java)
* [Python exercise](../python/src/Chapter3.py)