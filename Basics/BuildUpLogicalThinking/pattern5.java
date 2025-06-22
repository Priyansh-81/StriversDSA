//  Problem statement

// Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

// For every value of ‘N’, print the field if the trees are represented by ‘*’.
// Example:

// Input: ‘N’ = 3

// Output: 
// * * *
// * *
// *

import java.util.Scanner;

public class pattern5{
    public static void main(String [] args){
        Scanner mj=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=mj.nextInt();
        mj.close();
        Solution sol=new Solution();
        sol.seeding(n);
    }
}

class Solution {
    public void seeding(int n) {
        if(n<1 || n>25){
            return;
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}