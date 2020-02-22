package app;

/**
    * <p><strong><em>DESCRIPTION: </em></strong>contains various methods demonstreating different types of recursive tasks</p>
    *
    * <p><strong><em>APPLICATION NAME: </em></strong>Lab3_Recursion</p>
    *
    * <p><strong><em>CLASS NAME: </em></strong>Recursion</p>
    *
    * <p><strong><em>CLASS NOTES: </em></strong>none</p>
    *
    * <p><strong><em>PRE-CONDITION: </em></strong>none</p>
    *
    * <p><strong><em>POST-CONDITION: </em></strong>none</p>
    *
    * <p><strong><em>AUTHOR: </em></strong>Daniel C. Landon Jr.</p>
    * <p><strong><em>INSTRUCTOR: </em></strong>Dr. Bob Walsh</p>
    * <p><strong><em>COURSE: </em></strong>CSCI 202 - Introduction to Software Systems</p>
    * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
    * <p><strong><em>DATE DUE: </em></strong>02.20.2020</p>
    * 
*/
public class Recursion {

    /**
        * 
        * <p><strong><em>DESCRIPTION: </em></strong>return the number of digits in a number</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>DigitCount</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong></p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>none</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>none</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
        *
        * @param N number to count the digits
        * @return how many digitis are in a number
     */
    public int DigitCount(int N) {

        return String.valueOf(N).length();

    } // end DigitCount

    /**
        * 
        * <p><strong><em>DESCRIPTION: </em></strong>finds the sum of a positive number by adding all of the other values of the number supplied to the last digit of the number</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>sumOfDigits</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong>none</p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>PRE-CONDITION</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>successful</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
        *
        * @param N number to process
        * @return recursive value
     */
    public int sumOfDigits(int N) {

        return (String.valueOf(N).length() == 1) ? N : (N % 10 + sumOfDigits(N / 10));

    } // end sumOfDigits

    /**
        * 
        * <p><strong><em>DESCRIPTION: </em></strong>generates Fibonacci sequence</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>Fibonacci</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong>none</p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>none</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>generated fibonacci sequence</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
        *
        * @param N where to start sequence
        * @return recursive value
     */
    public int Fibonacci(int N) {

        // // variables
        int _answer = 0;

        if ( N < 2 ) {

            _answer = N;

        } // end if

        else {

            // recursion

            _answer = Fibonacci(N - 1) + Fibonacci(N - 2);

            System.out.printf("Calling Fibonacci(%d) ... Fibonacci(%d - 1) + Fibonacci(%d - 2) ... %d\n", 
                N, N, N, _answer );

        } // end else

        return _answer;

    } // end Fibonacci

    /**
        * 
        * <p><strong><em>DESCRIPTION: </em></strong>takes a base number plus an exponent and returns the value</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>Power</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong>none</p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>none</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>none</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
        *
        * @param _base base number for power
        * @param _exp exponent to raise too
        * @return recursive value
     */
    public int Power(int _base, int _exp) {

        // variables
        int _answer = 0;

        if(_exp == 0) {

            //base case

            System.out.println("Base Case: " + _base +  " " + _exp);

            _answer = 1;

        } // end if

        else if(_exp == 0) {

            //base case

            System.out.println("Base Case: " + _base +  " " + _exp);

            _answer = _base;

        } // end else if

        else {

            // recursion

            _answer = _base * Power(_base, _exp - 1);

            System.out.printf("Calling Power(%d, %d) ... %d * Power(%d, %d -1 ) ... %d\n", 
                _base, _exp, _base, _base, _exp, _answer);

        } // end else

        return _answer;

    } // end Power

    /**
        * 
        * <p><strong><em>DESCRIPTION: </em></strong>factors a value</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>Factoral</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong>none</p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>integer to factor</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>results</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
        *
        * @param N number to factor
        * @return recursive value
     */
    public int Factoral(int N) {

        // variables
        int _answer = 0;

        if (N <= 1) { 

            // base case

            System.out.println("Base Case: " + N);

            _answer = 1;

        } // end if 
        else { 

            // recursion

            _answer = N * Factoral(N - 1);

            System.out.printf("Calling Factoral(%d) ... %d * Factoral(%d - 1) ... %d\n", N, N, N, _answer);

        }  // end else

        return _answer; 
 
    } // end Factoral
    
}