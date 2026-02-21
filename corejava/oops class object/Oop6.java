class Employee
{
String name;
int age;
double salary;
double height;
double weight;
}
class Oop4
{
	public static void main(String[]args){
		Employee e=new Employee();
		e.name="Dibyasha";
		e.age=20;
		e.height=5.3;
		e.salary=75000;
		e.weight=65;
		System.out.println("name="+e.name);
		System.out.println("age="+e.age);
		System.out.println("salary="+e.salary);
		System.out.println("height="+e.height);
		System.out.println("weight="+e.weight);
	}
}