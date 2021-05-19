
public class reversesubarray {

	public static void main(String[] args) {
	int arr[]=new int[] {5,6,8,9};
	int k=3;
	
	
	for(int i=0;i<k;i++)
	{
		int b[]= arr.clone();
	}
for(int m=k;m<arr.length;m++) {
		int c[]=arr.clone();
	}

	for(int j=k-1;j>=0;j--) {
		System.out.println(arr[j]+" ");
	
	}
	for(int n=arr.length-1;n>=k;n--)
	{
		System.out.println(arr[n]+" ");
		
	}

}
}