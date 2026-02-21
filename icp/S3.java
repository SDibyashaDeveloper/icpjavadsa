import java.util.Scanner;
class S3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(countVowels(s));	
	}
	static int countVowels(String s)
	{
		int c=0;
		for(char ch:s.toLowerCase().toCharArray())
			if("aeiou".indexOf(ch)!=-1) c++;
		return c;
	}
}