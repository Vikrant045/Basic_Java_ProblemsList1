package BasicMethodsProblems;
import java.util.*;


public class CheckNumIsPalindromeOrNot {

    public static void Check(int a) {

        int Palindrome=a;
    int  chPali = 0;
        while(a>0){

          int rem =  a%10;
          chPali = (chPali*10) + rem;
          a = a/10;

        }
        if(Palindrome==chPali){

            System.out.println(Palindrome+" is a palindrome number");

        }
        else{
            System.out.println(Palindrome+" is not a palindrome number");

        }

        
    }

    public static void main(String args[]) {
        
   

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number to check either it is Palindrome or not");
    int a = sc.nextInt();
    Check(a);
}
}
