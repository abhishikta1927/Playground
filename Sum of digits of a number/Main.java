import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int n,sum=0;
      while(number>0)
      {
        n=number%10;
        sum=sum+n;
        number=number/10;
      }
      System.out.println(sum);
	}
}