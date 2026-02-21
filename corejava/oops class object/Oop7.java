class Employee
{

	private String name;
	private int age;
	 private double salary;
	 private double height;
	 private double weight;
	 void init()
	 {
         name="dibyasha";
         age=20;
         salary=75000;
         height=5.3;
         weight=65;
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
class Oop7
{
	public static void main(String arg[])
	{
	      Employee e=new Employee();
	     
	     e.init();
	     e.disp();

	}
}
