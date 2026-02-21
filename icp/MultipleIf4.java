import java.util.Scanner;
class MultipleIf4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		if(no>99 && no>1000){
			System.out.println("3 digit no");
		}
	}
}

