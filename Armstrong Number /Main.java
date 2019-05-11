import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int orig,remainder,result=0;
      orig=num;
      while(orig!=0)
      {
        remainder=orig%10;
        result=result+remainder*remainder*remainder;
        orig=orig/10;
      }
      if(result==num)
        System.out.println("Armstrong Number");
      else 
        System.out.println("Not a Armstrong Number");
	}
}