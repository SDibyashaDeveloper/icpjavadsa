import java.util.Scanner;
class F6
{
	static int check(int n)
	{
		if(n%2==0)
			return 1;
		else
			return 0;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter a number:");
		n=sc.nextInt();
		result=check(n);
		if(result==1)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}
}