import java.util.*;
public class EvenAndOddSum {

    public static void main(String args[]){
        int EvenSum =0,OddSum=0;
        int d;
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter any Number");
      //  int a = sc.nextInt();

        do{
            System.out.println("Enter any Number");
            int a = sc.nextInt();
            if(a%2==0){
                EvenSum+=a;
            }
            else {
                OddSum +=a;
            }
            System.out.println("Enter 1 to continue and other number to exit");
          d = sc.nextInt();


        }while(d==1);
        System.out.println(" Sum of all Entered Even Numbers : "+EvenSum);
        System.out.println(" Sum of all Entered Odd Numbers : "+OddSum);

    }

    }

