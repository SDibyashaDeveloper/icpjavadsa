import java.util.Scanner;
class Switch3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		double area;
		System.out.println("----SHAPE MENU----");
		System.out.println("1.circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice){
		   case 1:
		   	    System.out.println("Enter radius:");
		   	    double r=sc.nextDouble();
		   	    area=3.14*r*r;
		   	    System.out.println("Area of Circle="+area);
		   	    break;
		   case 2:
		   	    System.out.println("Enter length and breadth");
		   	    double l=sc.nextDouble();
		   	    double b=sc.nextDouble();
		   	    area =l*b;
		   	    System.out.println("Area of Rectangle="+area);
		   	    break;
		   case 3:
		   	    System.out.println("Enter base and height:");
		   	    double base=sc.nextDouble();
		   	    double h=sc.nextDouble();
		   	    area=0.5*base*h;
		   	    System.out.println("Area of Triangle="+area);
		   	    break;
		   	default:
		   		System.out.println("Invalid choice");

		}

	}
}