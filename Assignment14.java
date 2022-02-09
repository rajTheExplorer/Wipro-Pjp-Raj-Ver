class Assignment14
{
	public static void main(String[] args) {
		if(args.length==0)
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
			int num=Integer.parseInt(args[0]);
			if(num==1 || num==0)
			{
				System.out.println(num+" is neither prime nor composite number");
			}
			else
			{
				int count=0;
				for(int i=1;i<=num;i++)
				{
					if(num%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(num+" is a prime number");
				}
				else 
				{
					System.out.println(num+" is not a prime number");
				}
			}
		}
	}
}