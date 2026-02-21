import java.util.Scanner;
class MultipleIf5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a char");
		char ch=sc.next().charAt(0);
		if(ch<='A'&&ch>='Z'){
			System.out.println("upper case");
		}
	}
}

