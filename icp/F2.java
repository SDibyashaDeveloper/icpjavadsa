import java.util.Scanner;
class F2
{
	static void sical()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a p");
		double p=sc.nextDouble();
		System.out.println("enter interest");
		double r=sc.nextDouble();
		System.out.println("enter time");
		int t=sc.nextInt();
		double si=p*r*t/100;
		System.out.println("simple interest="+si);
		return;
	}
	public static void main(String[]args)
	{
		sical();
	}
}