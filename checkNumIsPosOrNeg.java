import java.util.*;
public class checkNumIsPosOrNeg {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println(" Enter Number ");
        int s= sc.nextInt();
        if(s<0){
            System.out.println("number is negative");

        }
        else{
            System.out.println("number is positive");
        }
    }
    
}
