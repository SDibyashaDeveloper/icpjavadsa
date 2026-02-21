import java.util.Scanner;
class S1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string");
		String s=sc.nextLine();
		System.out.print("enter a char");
		char ch=sc.next().charAt(0);
		int c=count(s,ch);
		System.out.println("the number of occurrences of"+ch+"in"+s+"is"+c);
	}
	public static int count(String s,char a)
	{
		int i,c=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)==a)
			{
				c++;
			}
		}
		return c;
	}
}