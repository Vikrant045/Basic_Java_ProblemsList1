import java.util.*;
public class DecimalToBinary {

    public static int Binary(int dec) {
int bin=0;
int pow=0;
        while(dec>0){
int rem = dec%2;
bin = bin +(rem*(int)Math.pow(10, pow));
pow++;
      dec= dec/2;
        }
        return bin;
    }

    public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal : ");
        int dec = sc.nextInt();
        System.out.println("Binary is  : "+Binary(dec));


    }
        
    }

    

