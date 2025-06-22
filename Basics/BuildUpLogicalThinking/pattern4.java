//  Problem statement

// Sam is making a Triangular painting for a maths project.

// An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers representing the row number.

// For every value of ‘N’, help sam to print the corresponding Triangle.
// Example:

// Input: ‘N’ = 3

// Output: 
// 1
// 2 2 
// 3 3 3

import java.util.Scanner;

public class pattern4{
    public static void main(String [] args){
        Scanner mj=new Scanner(System.in);
        System.out.print("Enter N:\t");
        int n=mj.nextInt();
        mj.close();
        Solution sol= new Solution();
        sol.nTriangle(n);
    }
}

class Solution {
    public void nTriangle(int n) {
        if(n<1 || n>25){
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}