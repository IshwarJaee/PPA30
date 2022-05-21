import java.util.*;
import java.lang.*;

class Exception5
{
  public static void main(String arg[])
  {
   
   Scanner sobj=new Scanner(System.in);

   System.out.println("Enter first number");
   int no1=sobj.nextInt();

   System.out.println("Enter first number");
   int no2=sobj.nextInt();
   Demo dobj=new Demo();
   try
   {
     int ret=dobj.Division()
   }
    
   


   
   
  }
}

class Demo
{
  public void Division(int no1,int no2)throws ArithemeticException
  {
    return no1/no2;
  }
}