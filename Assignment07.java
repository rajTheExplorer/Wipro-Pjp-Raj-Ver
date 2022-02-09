import java.util.*;
class Assignment07
{
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		int[] arr={12,34,12,45,67,89};
		for(int i=0;i<arr.length;i++)
		{
			if(al1.contains(arr[i]))
			{
				continue;
			}
			else 
			{
				al1.add(arr[i]);
			}
		}
		System.out.println(al1);
	}
}