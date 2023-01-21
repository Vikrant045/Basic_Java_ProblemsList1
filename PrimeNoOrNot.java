import java.util.*;
public class PrimeNoOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
int count = 0 ;
        for(int i=2;i<=Math.sqrt(n);i++){
     //  count =0;

            if(n%i==0){

                count++;
                break;
            }
           // count =0;
           
        }
        if(count == 1){
        System.out.println(n+" is not a Prime number");
        }
        else{
            System.out.println(n+" is a Prime number");

        }

    }
    
}
