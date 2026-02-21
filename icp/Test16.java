import java.util.Scanner;
class Test16{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fahreneit");
		double f=sc.nextDouble();
		System.out.println("Enter celcius");
		double c=(f-32)*5/9;
		System.out.println("fahreneit="+f);
		System.out.println("celcius="+c);
	}
}