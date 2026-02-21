import java.util.Scanner;
class If4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
	
		System.out.println("enter a no");
	int no=sc.nextInt();

		if(no>0)
		{
			System.out.println("+ve no");
		}
		if(no<0){
			System.out.println("-ve no");
		}
		
		if(no%2==0){
			System.out.println("even no");
		}
		
		if(no%2!=0){
			System.out.println("odd no");
		}
		
	}
}