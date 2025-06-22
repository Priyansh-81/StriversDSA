//  Problem statement

// Aryan and his friends are very fond of the pattern. For a given integer ‘N’, they want to make the Reverse N-Number Triangle.
// Example:

// Input: ‘N’ = 3

// Output: 

// 1 2 3
// 1 2
// 1

// Detailed explanation ( Input/output format, Notes, Images ) 

import java.util.Scanner;

public class pattern6{
    public static void main(String[] args){
        Scanner mj=new Scanner(System.in);
        System.out.print("Enter N:\t");
        int n=mj.nextInt();
        mj.close();
        Solution sol=new Solution();
        sol.nNumberTriangle(n);
    }
}

class Solution {
    public void nNumberTriangle(int n) {
        if(n<1 || n>20){
            return;
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}