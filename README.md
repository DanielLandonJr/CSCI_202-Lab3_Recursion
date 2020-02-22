# Lab3 - Recursion

This is a list of 9 recursive methods to write and test.

Lab 3 - Recursion
Implement and test the following static recursive methods. Test several examples. We have already done several so be sure to document.

## Factorial
## Power
## Fibonacci
## DigitSum (Find the sum of digits of a positive integer number)

Sum = number itself if (number is a single digit)

otherwise sum = the last digit of the number + the sum of rest of the digits of the number.

public int sumOfDigits(int number)

Test this method with following input numbers: 0, 101, 1, 231214, 734

## DigitCount – find the sum of the digits in an integer digitCount(12345) would be 5
## Power2 - Efficiently compute exponentiation for non-negative exponents by the following recursive algorithm:

```
bx = 1 if x == 0
```

```
bx = (b(x/2))2  if x is even bx = b * (b(x-1)) if x is odd
```

## Write the recursive method and help method to count the uppercase letters in a string.
 
```
public static int countUppercase(String str) {

    return countUppercase(str, str.length() - 1);

  }//upper

 

  public static int countUppercase(String str, int high) {

    System.out.println("countUppercase("+str+", "+high+")"); 

    int count =0;

    if (high >= 0){

        if (Character.isUpperCase(str.charAt(high))) count = 1;

                else count =0;

 

       return countUppercase(str, high - 1) + count;

          }//high

      

    else

      return 0;

  }//upper 
```

## Write the similar countLowercase methods
## Write the similar countDigits methods 

Test with this string: 

“We must be Ready in C202 for Exam 1 which Will be in 2 weeks”