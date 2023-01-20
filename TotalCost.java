import java.util.*;


public class TotalCost {
    public static void main (String args[]){
      

    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter price of Pen : ");
        float a = sc.nextFloat();
        System.out.print("Enter price of Pencil : ");
        float b = sc.nextFloat();
        System.out.print("Enter price of Eraser : ");
        float c = sc.nextFloat();
        float bill= (float)a+b+c;
        System.out.println(" Total Cost : "+bill);
        
        double gst = bill+bill*18/100;
        System.out.print(" Total Cost after Adding 18% GST  : "+gst);


    
}
}
