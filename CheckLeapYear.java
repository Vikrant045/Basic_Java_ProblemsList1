import java.util.*;
public class CheckLeapYear {
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println(" Enter Year ");

        int year = sc.nextInt();

       /*  boolean a = year%4==0;
        boolean b = year%100!=0;
        boolean c = year%100==0 && year%400==0;*/

        if(year%4==0 && (year%100!=0||year%400==0)){
            System.out.println(year +" is Leap Year ");
        }
        
        else{
            System.out.println(year +" is not a Leap Year ");

        }
    }
    
}
