import java.util.*;
import java.lang.*;

class Exception3
{
  public static void main(String arg[])
  {
   int Arr[]={10,20,60,30,40,50};

   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter the Index");
   int Index=sobj.nextInt();
   
   try
   {
    System.out.println("Inside try");

     System.out.println("Enter at that Index is :"+Arr[Index]);
   }
   catch(ArrayIndexOutOfBoundsException obj)
   {
     System.out.println("Inside catch");
     System.out.println(obj);
   }
   catch(Exception obj)
   {
     System.out.println(obj);
   }
   finally
   {
     System.out.println("Inside finally");
     sobj.close();
   }
    System.out.println("End of application");
  }
}