import java.util.Scanner;
class Switch7
{
     public static void main(String arg[])
     {
          Scanner sc=new Scanner(System.in);
        
          System.out.println("enter your choice\n1.square\n2.rectangle\n3.circle");
          int ch=sc.nextInt();
         switch(ch)
         {
          case 1:

          System.out.println("enter square  side ");
          int s=sc.nextInt();
          System.out.println("area of square="+s*s);
          break;
         
           case 2: System.out.println("sub="+(no1-no2));break;
         
          case 3:  System.out.println("mult="+no1*no2);break;
         
          default:  System.out.println("invalid choice");
          }
     }
}