class Array9
{
	public static void main(String[]args)
	{
		int arr[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120}};
		int i,j;
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}