import java.util.Scanner;
class Main
{   
   public static int square(int n)
   {
     int squarenum;
     squarenum=n*n;
     return squarenum;
   }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int m;
      m=  square(n);
      System.out.println(m);
	} 
}