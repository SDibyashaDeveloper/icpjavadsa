import java.util.Scanner;
class Switch2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int no1,no2;
		char ch;
		System.out.println("enter two nos");
		no1=sc.nextInt();
		no2=sc.nextInt();
		System.out.println("enter your choice + - * \n");
		  ch=sc.next().charAt(0);
		  Switch(ch)
		  {
		  case '+':System.out.println("add="+(no1+no2));break;
		  case '-':System.out.println("sub="+(no1-no2));break;
		  case '*':System.out.println("mult="+no1*no2);break;
		  default:System.out.println("no match");break;
		  
		  }
	}
}