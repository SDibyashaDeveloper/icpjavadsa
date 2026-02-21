import java.util.Scanner;
class S4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("enter a string");
		int c=countWords(s);
		System.out.println("The number of words in"+s+"is"+c);
	}
	public static int countWords(String str)
	{
		int c=0;
		boolean word=false;
		for(char ch:str.toCharArray())
		{
			System.out.println(ch);
			if(ch !=' '&& !word)
			{
				c++;
				word=true;
			}
			else if(ch==' ')
			{
			    word=false;
			}
		}
		return c;
	}
}