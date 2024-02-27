

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
