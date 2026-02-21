import java.util.Scanner;
class elseifladder{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if(no%35==0){
			System.out.println("div by 5 & 7");
		}
		else if(no%5==0){
			System.out.println("div by 5");
		}
		else if(no%7==0){
			System.out.println("div by 7");
		}
		else{
			System.out.println("not div by 5 & 7");
		}		
	}
}