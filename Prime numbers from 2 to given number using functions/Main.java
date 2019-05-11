import java.util.*;
class Main
{
     public static void primenum(int m)
     {
       int n=2;
       while(n<m)
       {
        boolean flag=false;
         for(int i=2;i<=n/2;++i)
         {
           if(n%i==0)
           {
             flag=true;
             break;
           }
         }
         if(!flag)
           System.out.println(n);
         ++n;
       }
     }
       
      public static void main(String args[])
      {
        Scanner in=new Scanner(System.in);
        int high=in.nextInt();
        primenum(high);
      }    
}
