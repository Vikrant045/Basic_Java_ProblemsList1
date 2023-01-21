import java.util.*;
public class ListOfPrimeNums {


    public static boolean IsPrime(int n)
    {
        boolean isPrime = true;

        if(n==2){
            isPrime= true;
          
        }
        else{

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        }
        return isPrime;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print All Prime numbers : ");

        int n = sc.nextInt();

        for(int i =2;i<n;i++){
         boolean check = IsPrime(i);
         if(check == true){
            System.out.println(i);
         }
        }
        
    }
    
}
