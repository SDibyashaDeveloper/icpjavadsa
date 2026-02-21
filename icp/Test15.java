import java.util.Scanner;
class Test15{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter side of square");
		double s=sc.nextDouble();
		double ar=s*s;
		double pr=4*s;
		System.out.println("side="+s);
		System.out.println("area="+ar);
		System.out.println("perimeter="+pr);
	}
}