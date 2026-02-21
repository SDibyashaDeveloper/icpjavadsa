import java.util.Scanner;
class NestedIf1{
	public static void main(String[ ]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		if(no>9)
		{
			if(no<100)
			{
				System.out.println("2 digit no");
			}
		}
	}
}

