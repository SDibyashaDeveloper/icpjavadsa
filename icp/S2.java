import java.util.Scanner;
class S2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string");
		String s=sc.nextLine();
		int c=countVowels(s);
		System.out.println("the number of vowel in"+s+"is"+c);
	}
	public static int countVowels(String s)
	{
		int i,c=0;
		for(i=0;i<s.length();i++)
		{
			switch(s.charAt(i))
			{
			       case 'a':
			       case 'e':
			       case 'i':
			       case 'o':
			       case 'u':
			       case 'A':
			       case 'E':
			       case 'I':
			       case 'O':
			       case 'U':
			       	c++;
			}
		}
		return c;
	}
}