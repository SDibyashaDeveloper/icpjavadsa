import java.util.*;
class Student
{
	private String name;
	private int roll;
	 private double mark;
	 void init()
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter name roll and mark ");
         name=sc.nextLine();
         roll=sc.nextInt();
         mark=sc.nextDouble();
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my roll="+roll);
	     System.out.println("my mark="+mark);
	 }
}
class Oop8
{
	public static void main(String arg[])
	{
	      Student s=new Student();
	    
	     s.init();
	     s.disp();
	       Student s1=new Student();
	      s1.init();
	      s1.disp();
	}
}
