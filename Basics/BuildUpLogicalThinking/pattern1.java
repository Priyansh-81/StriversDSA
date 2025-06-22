//  Problem statement

// Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

// For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
// Example:

// Input: ‘N’ = 3

// Output: 
// * * *
// * * *
// * * *
import java.util.Scanner;

public class pattern1{
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        System.out.println("enter N:");
        int n=mj.nextInt();
        mj.close();
        Solution sol=new Solution();
        sol.nForest(n);

    }
}

class Solution {
    public static void nForest(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}