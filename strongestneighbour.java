
public class strongestneighbour {
	public static void main(String[] args) {
		int arr[]=new int[] {10,9,2,7,5};
		int res=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
				 res=arr[i];
			System.out.println(res);
		}
	}

}
