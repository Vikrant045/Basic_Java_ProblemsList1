public class BinomialCofficient{


    public static int factorial(int n) {
        int f =1;
        for(int i =1;i<=n;i++){
            f=f*i;
        }
        return f;
        
    }
    public static int binomial(int nb,int r) {
      int a = factorial(nb);
      int b = factorial(r);
      //int m = a-b;
      int c = factorial(nb-r);
      int h = b*c;
int  g = a/h;
      return g;

        
    }

    public static void main (String args[]){
     int BinoCoffi =  binomial(5, 2);
//System.out.println(factorial(5));
System.out.println("Binomial Cofficient = "+BinoCoffi);
    }
}