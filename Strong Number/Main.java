import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int i,orig,last,sum,fact;
      orig=num;
      sum=0;
      while(num>0)
      {
       last=num%10;
        fact=1;
       for(i=1;i<=last;i++)
        {
          fact=fact*i;
        }
        sum=sum+fact;
        num=num/10;
      }
      if(sum==orig)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}