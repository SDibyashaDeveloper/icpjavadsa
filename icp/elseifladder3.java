import java.util.Scanner;
class elseifladder3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if(no<0){
			System.out.println("no=-no");
		}
	    if(no<10){
			System.out.println("sd");
		}
		else if(no<100){
			System.out.println("dd");
		}
		else if(no<1000){
			System.out.println("tt");
		}
		else
			System.out.println("od");
	}
}