// class Solution {
//     public void printNumber(Scanner sc) {
//         int num;
//         num = sc.nextInt();
//         System.out.print(num);
//         sc.close();
//     }
// }

import java.util.Scanner;

class io{
    public static void main(String args[]){
        Scanner mj = new Scanner(System.in);
        int num = mj.nextInt();
        System.out.print(num);
        mj.close();
    }
}