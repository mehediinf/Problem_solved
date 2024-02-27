/**

Task : 
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format :
A single integer, N.

Output Format :
Print 10 lines of output; each line  (where 1<=N<=10) contains the  of N x i in the form:
N x i = result.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        

        Scanner userInput = new Scanner(System.in);

        int N = userInput.nextInt();

        for(int i=1;i<=10;i++){

            System.out.println(N +" x "+i+" = "+(N*i));

        }

        userInput.close();


    }
}
