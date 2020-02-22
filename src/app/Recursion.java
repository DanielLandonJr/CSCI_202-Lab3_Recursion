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
        * <p><strong><em>DESCRIPTION: </em></strong>DESCRIPTION</p>
        * 
        * <p><strong><em>METHOD NAME: </em></strong>METHOD NAME</p>
        *
        * <p><strong><em>METHOD NOTES: </em></strong>METHOD NOTES</p>
        *
        * <p><strong><em>PRE-CONDITION: </em></strong>PRE-CONDITION</p>
        *
        * <p><strong><em>POST-CONDITION: </em></strong>POST-CONDITION</p>
        *
        * <p><strong><em>AUTHOR: </em></strong> Daniel C. Landon Jr.</p>
        * <p><strong><em>DATE STARTED: </em></strong>DATE STARTED</p>
        *
        * @param N number to factor
        * @return recursive value
     */
    public int Factoral(int N) {

        if (N <= 1) { 
            System.out.println("Base Case: " + N);
            return  1; 
        } // end if 
        else { 
            int _ans = N * Factoral(N - 1);

            System.out.printf("Calling Factoral(%d) ... %d * Factoral(%d - 1) ... %d\n", N, N, N, _ans);

            return _ans; 
        }  // end else
 
    } // end Factoral
    
}