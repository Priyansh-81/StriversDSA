// Given the integer day denoting the day number, print on the screen which day of the week it is. Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

// Ensure only the 1st letter of the answer is capitalised.

// For printing use:-

//     for C++ : cout << variable_name;
//     for Java : System.out.print();
//     for Python : print()
//     for Javascript : console.log()
import java.util.Scanner;

public class switches{
    public static void main(String[] args){
        Solution sol= new Solution();
        Scanner mj= new Scanner(System.in);
        int day;
        System.out.print("day = ");
        day= mj.nextInt();
        sol.whichWeekDay(day);
        mj.close();
    }
}

class Solution {
    public void whichWeekDay(int day) {
        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid");
        }
    }
}