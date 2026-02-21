import java.util.Scanner;
class Array10
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int r,c;
		int arr[][];
		System.out.println("enter 2d array r and c");
		r=sc.nextInt();
		c=sc.nextInt();
		arr=new int[r][c];
		int i,j;
		System.out.println("enter 6 elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elements are");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}