import java.util.Scanner;
public class Main
{
    public static int gcd(int num1,int num2)
    {  int gcd1=1;
      for(int i=1;i<=num1 && i<=num2;++i)
      {
        if(num1%i==0&&num2%i==0)
          gcd1=i;
      }
      return gcd1;
    }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int gcd2=1;
     int num=gcd(n1,n2);
      for(int i=1;i<=num&&i<=n3;++i)
      {
        if(num%i==0&&n3%i==0)
          gcd2=i;
      }
      System.out.println(gcd2);
	}
}