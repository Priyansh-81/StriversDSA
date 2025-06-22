// given marks of a student, print on the screen:

//     Grade A if marks >= 90
//     Grade B if marks >= 70
//     Grade C if marks >= 50
//     Grade D if marks >= 35
//     Fail, otherwise.
import java.util.Scanner;

class ifelse{
    public static void main(String[] args){
        Scanner mj= new Scanner(System.in);
        System.out.print("marks: ");
        int marks=mj.nextInt();
        mj.close();
        if(marks<0 || marks>100){
            System.out.print("Marks entered is invalid, please try again ");
            return;
        }else{
            if(marks>=90){
                System.out.print("Grade A");
            }
            else if(marks>=70){
                System.out.print("Grade B");
            }
            else if(marks>=50){
                System.out.print("Grade C");
            }
            else if(marks>=35){
                System.out.print("Grade D");
            }
            else{
                System.out.print("Fail");
            }
        }

    }
}