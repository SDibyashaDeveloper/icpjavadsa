import java.util.Scanner;
class F1
{
	static void add()
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2,s;
		System.out.println("enter two nos");
		no1=sc.nextInt();
		no2=sc.nextInt();
		s=no1+no2;
		System.out.println("sum="+s);
		return;
	}
	public static void main(String[]args)
	{
		add();
	}
}