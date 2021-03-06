import java.util.*;
import java.lang.*;

class Exception2
{
  public static void main(String arg[])
  {
    int ans=0,no1=0,no2=0;
    Scanner sobj = new Scanner(System.in);
    
    System.out.println("Enter first number");
     no1=sobj.nextInt();

    System.out.println("Enter second number");
     no2=sobj.nextInt();

    try
    {
      ans=no1/no2;    //Exception prone code
    }
    
    catch(ArithmeticException obj)
    {
      System.out.println("Exception occured as:"+obj);
    }

    finally   
    {
      sobj.close();  //resource deallocation
    }

    System.out.println("Division is :"+ans);
  }
}