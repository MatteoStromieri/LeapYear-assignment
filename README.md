# Leap Year assignment
Write a Java program that prints true or false depending on whether a given integer is a leap year or not.

A leap year is divisible by 4, but is not otherwise divisible by 100 unless it is also divisible by 400.

For example, 2001 is a typical common year and 1996 is a typical leap year, whereas 1900 is an atypical common year and 2000 is an atypical leap year.
# My notes
So we want a function that receives an intager (k) as input and prints true if
- k % 4 == 0
- (k % 100 !== 0) or (k % 400 == 0)
false otherwise
# My tests
0 -> false
1 -> false
4 -> true
100 -> false 
104 -> true
110 -> false
400 -> true