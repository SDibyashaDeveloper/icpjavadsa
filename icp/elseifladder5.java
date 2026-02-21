import java.util.Scanner;
class elseifladder5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		System.out.println("enter your choice\n1.add\n2.sub\n3.mul");
		int ch=sc.nextInt();
		if(ch==1){
			System.out.println("sum="+(no1+no2));
		}
		else if(ch==2){
			System.out.println("sub="+(no1-no2));
		}
		else if(ch==3){
			System.out.println("mul="+(no1*no2));
		}
		else{
			System.out.println("invalid choice");
		}
		

	}
}