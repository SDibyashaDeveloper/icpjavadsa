import java.util.Scanner;
	class Test12{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two real numbers");
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println(" first no="+a);
			System.out.println("second no="+b);
			System.out.println("add="+(a+b));
			System.out.println("mult="+a*b);
		}
	}