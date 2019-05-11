import java.util.Scanner;
class Main
{
  public static int greatest(int num1,int num2)
  {
    if(num1>num2)
      return num1;
    else 
      return num2;
  }
    
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
      int largest=greatest(n1,n2);
      if(largest>n3)
        System.out.println(largest);
      else
        System.out.println(n3);
      
	}
}