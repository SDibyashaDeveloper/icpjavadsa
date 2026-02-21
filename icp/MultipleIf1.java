import java.util.Scanner;
class MultipleIf1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if(no<0){
			System.out.println("-ve no");
		}
		if(no>0){
			System.out.println("+ve no");
		}
		if(no==0){
			System.out.println("zero");
		}
	}
}

