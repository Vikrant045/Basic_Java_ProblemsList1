
import java.util.*;
public class BinaryToDecimal {

    public static int Decimal(int binary){
int pow = 0;
int dec = 0;
        while(binary>0){
            int lastDigit = binary%10;
            dec =  (int) (dec+(lastDigit*Math.pow(2,pow )));
            pow++;
            binary = binary/10;

        }
        return dec;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Number..");
        int n = sc.nextInt();
        System.out.println("Decimal Number of "+n+" = "+Decimal(n));
        
    }
    
}
