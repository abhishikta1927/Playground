import java.util.Scanner;
class Main
{
  public static int power(int m, int n)
  {
    int result=1;
    while(n!=0)
    {
      result*=m;
      --n;
    }
    return result;
  }
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    int pow=power(base,exponent);
    System.out.println(pow);
  }
}
    