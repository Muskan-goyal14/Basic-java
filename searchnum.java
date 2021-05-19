import java.util.Scanner;

public class searchnum {

	public static void main(String[] args) {
		int n ,i;
		Scanner ref = new Scanner(System.in);
		System.out.print("ënter length for array");
		n=ref.nextInt();
		int a[]=new int[n];
		System.out.print("ënter values");
		for(i=0;i<a.length;i++)
		{
			a[i]=ref.nextInt();
		}
		Processs aref=new Processs();
		int snum= aref.find(a);
		System.out.print("successfully found ="+snum);
	}

}
class Processs{
	int find(int []arr)
	{
		int flag=0;
		int c=0;
		Scanner bref=new Scanner(System.in);
		System.out.print("ënter the number you want to search");
		int x= bref.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(x == arr[i])
			{
				flag=1;
				
				//c++;
				break;
			}
			else 
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			//System.out.print("count="+c);
			return(x);
		}
		else 
			return 0;
	}
}