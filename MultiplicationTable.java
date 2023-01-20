import java.util.*;
public class MultiplicationTable {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
System.out.print("Enter number multiplication table : ");
 int a = sc.nextInt();
 for(int i=1;i<=10;i++){
    int multi = a*i;
    System.out.println(a+" X "+i+" = "+multi);
 }

    }
    
}
