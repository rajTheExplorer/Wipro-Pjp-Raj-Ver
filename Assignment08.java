class Assignment08
{
	public static void main(String[] args) {
		int[] arr={1,6,4,7,9};
		int sum=0;
		int firstIndex=Integer.MIN_VALUE;
		int secondIndex=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==6)
			{
				firstIndex=i;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==7)
			{
				secondIndex=j;
			}
		}
		for(int q=0;q<arr.length;q++)
		{
			if(q>=firstIndex && q<=secondIndex)
			{
				continue;
			}
			else 
			{
				sum=sum+arr[q];
			}
		}
		System.out.println(sum);
	}
}