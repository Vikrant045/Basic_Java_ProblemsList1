package BasicMethodsProblems;
import java.util.*;
public class AverageOfThreeNums {


    public static int Average(int a,int b, int c) {

        int Average = (a+b+c)/3;

        return Average;
        
    }
    public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter three number to get their Average..");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

System.out.println("Average of these numbers : "+Average(a, b, c));


        
    }
    
}
