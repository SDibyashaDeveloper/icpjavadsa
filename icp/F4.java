import java.util.Scanner;
class F4
{
	static int add()
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2,s;
		System.out.println("enter two nos");
		no1=sc.nextInt();
		no2=sc.nextInt();
		s=no1+no2;
		return s;
	}
	public static void main(String[]args)
	{
		int res=add();
		System.out.println("sum="+res);
	}
}