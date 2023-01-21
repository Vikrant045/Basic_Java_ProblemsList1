package BasicMethodsProblems;
import java.util.*;
public class CheckNumIsEvenOrNot {

    public static boolean name(int a) {
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[]) {

Scanner sc = new Scanner (System.in);
System.out.println("Enter number to check either it is even or not");
int a = sc.nextInt();
System.out.println(name(a));
        
    }
    
}
