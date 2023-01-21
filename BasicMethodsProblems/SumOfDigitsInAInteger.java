package BasicMethodsProblems;
import java.util.*;
public class SumOfDigitsInAInteger {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Any number : ");
        int a = sc.nextInt();

        int sum =0;

        while(a>0){
          int last =  a%10;
          sum+=last;
          a = a/10;
        }

        System.out.print(" Sum of digits is : "+sum);
        
    }
    
}
