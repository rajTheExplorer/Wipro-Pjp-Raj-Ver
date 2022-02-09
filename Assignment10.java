import java.util.*;
class Assignment10
{
	public static void main(String[] args) {
		// String[] str={args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]};
		String[] str={"1","2","3","4","5","68","7","8","9"};
		int[] arr=new int[str.length];
		for(int u=0;u<str.length;u++)
		{
			arr[u]=Integer.parseInt(str[u]);
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}
