import java.util.*;
class Employee
{
	private String name;
	private int age;
	 private double salary;
	 private double height;
	 private double weight;
	 void init()
	 {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter name age salary height and weight");
         name=sc.nextLine();
         age=sc.nextInt();
         salary=sc.nextDouble();
         weight=sc.nextDouble();
         height=sc.nextDouble();
	 }
	 void disp()
	 {
	     System.out.println("my name="+name);
	     System.out.println("my age="+age);
	     System.out.println("my salary="+salary);
	     System.out.println("my height="+height);
	     System.out.println("my weight="+weight);
	 }
}
class Oop9
{
	public static void main(String arg[])
	{
	      Employee e1=new Employee();
	    
	     e1.init();
	     e1.disp();
	       Employee e2=new Employee();
	      e2.init();
	      e2.disp();
	}
}