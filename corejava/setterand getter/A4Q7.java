import java.util.Scanner;
class A4Q7
{
	public static void main(String[]args)
	{
		scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int no1=sc.nextInt;
		System.out.println("Enter the second number:");
		int no2=sc.nextInt;
		int n,d;
		if(no1>=no2)
		{
			n=no1;
			d=no2;
		}
		else
		{
			n=no2;
			d=no1;
		}
		int r=n%d;
		while(r!=0)
		{
			n=d;
			d=r;
			r=n%d;
		}
		System.out.println("gcd="+d);
		System.out.println("lcm="+no1*no2/d);
	}
}