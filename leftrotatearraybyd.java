import java.util.Scanner;

public class leftrotatearraybyd {
static void leftrotate(int arr[])
{
	int temp=arr[0];
	for(int i=1;i<arr.length;i++) {
		arr[i-1]=arr[i];
		
	}
	arr[arr.length-1]=temp;
}
static void leftrotbyd(int arr[],int d)
{
	for(int i=0;i<d;i++)
	{
		leftrotate(arr);
	}
}
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,5};
		int d;
		Scanner ref=new Scanner(System.in);
		d=ref.nextInt();
		leftrotbyd(arr,d);
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]+" ");
		}

	}

}
