import java.util.Scanner;

public class sumtwoarr {

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
		int b[]=new int[n];
		System.out.print("ënter values for 2 ");
		for(int j=0;j<b.length;j++)
		{
			b[j]=ref.nextInt();
		}
 Sumtwo bbref = new Sumtwo();
 int[] summ=bbref.tot(a, b);
 for(i=0;i<n;i++)
 {
	 System.out.print(summ[i]+" ");
 }
	}

}
class Sumtwo{
	int[] tot(int[] arr,int[] brr)
	{
		int k;
		int c[]=new int[arr.length];
		for(k=0;k<arr.length;k++)
		{
			c[k]=arr[k]+brr[k];
		}
		
		return (c);
	}
	
}