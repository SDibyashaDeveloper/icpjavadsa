class Array5
{
	public static void main(String[]args)
	{
		int arr[]={5,7,8,23,45};
		int s=0;
		int i;
		for(i=0;i<arr.length;i++)
		{
			s=s+arr[i];

		}
		System.out.println("sum="+s);
		System.out.println("averages="+s/arr.length);
	}
}