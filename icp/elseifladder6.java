import java.util.Scanner;
class elseifladder6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int no3=sc.nextInt();
		if(no1>=no2&&no1>=no3){
			System.out.println("1st no="+no1+"is bigger");
		}
		else if(no2>=no3){
			System.out.println("2nd no="+no2+"is bigger");
		}
		else{
			System.out.println("3rd no="+no3+"is bigger");
		}
	}
}