import java.util.Scanner;
class Test13{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the princpal");
		double p=sc.nextDouble();
		System.out.println("enter the rate of intrest");
		double r=sc.nextDouble();
		System.out.println("enter the time");
		double t=sc.nextDouble();
		double SI=(p*r*t/100);
		System.out.println("princpal="+p);
		System.out.println("rate of intrest="+r);
		System.out.println("time="+t);
		System.out.println("SI="+SI);
	}
}