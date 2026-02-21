import java.util.Scanner;
class Test18{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the roll number");
		int r=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the mark");
		double mark=sc.nextDouble();
		System.out.println("name="+name);
		System.out.println("roll number="+r);
		System.out.println("mark="+mark);
	}
}
