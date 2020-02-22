package app;

/**
    * <p><strong><em>DESCRIPTION: </em></strong>None</p>
    *
    * <p><strong><em>APPLICATION NAME: </em></strong>Lab3 Recursion</p>
    *
    * <p><strong><em>CLASS NAME: </em></strong>App</p>
    *
    * <p><strong><em>CLASS NOTES: </em></strong>client to my server</p>
    *
    * <p><strong><em>PRE-CONDITION: </em></strong>None</p>
    *
    * <p><strong><em>POST-CONDITION: </em></strong>application executes successfully</p>
    *
    * <p><strong><em>AUTHOR: </em></strong>Daniel C. Landon Jr.</p>
    * <p><strong><em>INSTRUCTOR: </em></strong>Dr. Bob Walsh</p>
    * <p><strong><em>COURSE: </em></strong>CSCI 202 - Introduction to Software Systems</p>
    * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
    * <p><strong><em>DATE DUE: </em></strong>02.20.2020</p>
    * 
*/
public class App {
    /**
        * 
        * <p><strong><em>DESCRIPTION: </em></strong>application entry point</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>main</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong>none</p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>none</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>application completes successfully</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>02.22.2020</p>
        *
        * @param args command line arguments, not used
        * @throws Exception error trapping
     */
    public static void main(String[] args) throws Exception {

        Recursion _recursion = new Recursion();

        int _factoral = 8;
        System.out.println("\n********** Factoral(" + _factoral + ") **********");
        _recursion.Factoral(_factoral);
        System.out.println("********** Factoral(" + _factoral + ") **********");

        int _powerBase = 2;
        int powerExp = 10;
        System.out.println("\n********** Power(" + _powerBase + ", " + +powerExp + ") **********");
        _recursion.Power(_powerBase, powerExp);
        System.out.println("********** Power(" + _powerBase + ", " + +powerExp + ") **********");

        int _fibonacci = 7;
        System.out.println("\n********** Fibonacci(" + _fibonacci + ") **********");
        System.out.println("Final Number of the Fibonacci Sequence Is: " + _recursion.Fibonacci(_fibonacci));
        System.out.println("********** Fibonacci(" + _fibonacci + ") **********");

        System.out.println("\n********** sumOfDigits **********");
        int _digitSum = 0;
        System.out.println("sumOfDigits (" + _digitSum +  "): " + _recursion.sumOfDigits(_digitSum));
        _digitSum = 101;
        System.out.println("sumOfDigits (" + _digitSum +  "): " + _recursion.sumOfDigits(_digitSum));
        _digitSum = 1;
        System.out.println("sumOfDigits (" + _digitSum +  "): " + _recursion.sumOfDigits(_digitSum));
        _digitSum = 231214;
        System.out.println("sumOfDigits (" + _digitSum +  "): " + _recursion.sumOfDigits(_digitSum));
        _digitSum = 734;
        System.out.println("sumOfDigits (" + _digitSum +  "): " + _recursion.sumOfDigits(_digitSum));
        System.out.println("********** sumOfDigits **********");

        System.out.println("\n********** DigitCount **********");
        int _digitCount = 0;
        System.out.println("Number of digits found (" + _digitCount +  "): " + _recursion.DigitCount(_digitCount));
        _digitCount = 101;
        System.out.println("Number of digits found (" + _digitCount +  "): " + _recursion.DigitCount(_digitCount));
        _digitCount = 1;
        System.out.println("Number of digits found (" + _digitCount +  "): " + _recursion.DigitCount(_digitCount));
        _digitCount = 231214;
        System.out.println("Number of digits found (" + _digitCount +  "): " + _recursion.DigitCount(_digitCount));
        _digitCount = 734;
        System.out.println("Number of digits found (" + _digitCount +  "): " + _recursion.DigitCount(_digitCount));
        System.out.println("********** DigitCount **********");
    
    } // end main

} // end App