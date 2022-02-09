import java.util.*;
class Assignment09
{
	public static void main(String[] args) {
		int[] arr={Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3])};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		for(int i=arr.length-1;i>=0;i--)
		{
			al1.add(arr[i]);
		}
		int[][] arr2d=new int[2][2];
		int count=0;
		for(int j=0;j<arr2d.length;j++)
		{
			for(int k=0;k<arr2d.length;k++)
			{
				arr2d[j][k]=al1.get(count);
				count++;
			}
		}
		System.out.println(Arrays.deepToString(arr2d));
	}
}