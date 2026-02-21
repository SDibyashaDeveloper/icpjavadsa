import java.util.Scanner;
class MultipleIf2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		if(no1==no2){
			System.out.println("same no");
		}
		if(no1>no2){
			System.out.println("1st no>2nd no");
		}
		if(no1<no2){
			System.out.println("1st no<2nd no");
		}
	}
}