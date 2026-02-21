class Array6
{
	public static void main(String[]args)
	{
		int arr[]={5,7,8,23,45};
		int i,temp;
		temp=arr[arr.length-1];
		arr[arr.length-1]=arr[0];
		arr[0]=temp;
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t");
		}
	}
}