import java.io.*;
import java.util.*;
class fibonacci
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
       int a=sc.nextInt();
       int b[]=new int[a];
       b[0]=0;
       b[1]=1;
       
       for(int i=2;i<a;i++)
       {    
            b[i]=b[i-1]+b[i-2];
        }  
        for(int i=0;i<a;i++)
        {
            System.out.println(b[i]+" ");
        }
       
    }
}
