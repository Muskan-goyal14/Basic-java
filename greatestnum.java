import java.util.Scanner;

public class greatestnum {

	public static void main(String arg[])
	{
		int n,i;
		System.out.print("find greatest number");
		Scanner ref=new Scanner(System.in);
		n= ref.nextInt();
		int a[]=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.print("enter number for array");
			a[i]=ref.nextInt();
		}
		
		Process aref=new Process();
		int maxx= aref.maxnum(a);
		System.out.print("greatest num="+maxx);
		
	}
}
class Process{
	int maxnum(int[] arr)
	{
		int maxx=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(maxx < arr[i])
			{maxx = arr[i];
		}
	}
	return (maxx);	
}
}