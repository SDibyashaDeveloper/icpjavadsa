import java.util.Scanner;
class Ifelse3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		int no1=sc.nextInt();
		System.out.println("enter 2nd no");
		int no2=sc.nextInt();
		if(no1==no2)
			System.out.println("same no");
		else
			System.out.println("different no");
	}
}

