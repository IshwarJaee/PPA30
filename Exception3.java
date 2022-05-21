import java.util.*;
import java.lang.*;

class Exception3
{
  public static void main(String arg[])
  {
   int Arr[]={10,20,30,40,50};

   Scanner sobj=new Scanner(System.in);
   System.out.println("Enter the Index");
   int Index=sobj.nextInt();

   System.out.println("Enter at that Index is :"+Arr[Index]);
  }
}