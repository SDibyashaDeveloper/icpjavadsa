import java.util.Scanner;
class Switch4
{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		switch(no%2)
		{
		case 0:System.out.println("even no");break;
		default:System.out.println("odd no");
		}
	}
}