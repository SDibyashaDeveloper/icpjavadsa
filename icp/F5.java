import java.util.Scanner;
class F5
{
	static double sical()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a p");
		double p=sc.nextDouble();
		System.out.println("enter interest");
		double r=sc.nextDouble();
		System.out.println("enter time");
		int t=sc.nextInt();
		double si=p*r*t/100;
		return si;
	}
	public static void main(String[]args)
	{
		double si=sical();
		System.out.println("si="+si);
	}
}