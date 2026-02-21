import java.util.Scanner;
class Test14{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length and breadth of rectangle");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		double ar=l*b;
		double pr=2*(l+b);
		System.out.println("length="+l);
		System.out.println("breadth="+b);
		System.out.println("area="+ar);
		System.out.println("perimeter="+pr);
	}
}
