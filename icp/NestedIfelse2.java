import java.util.Scanner;
class NestedIfelse2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int no=sc.nextInt();
		if(no!=0){
		
			if(no>0){
				System.out.println("+ve no");
			}
			else{
				System.out.println("-ve no");
			}

		}
		else{
			System.out.println("0");
		}
	}
}


