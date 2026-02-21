import java.util.Scanner;
class elseifladder2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		if(no1==no2){
			System.out.println("same no");
		}
		else if(no1>no2){
			System.out.println("1st>2nd");
		}
		else
			System.out.println("1st<2nd");
	}
}
 