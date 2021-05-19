
public class meanedian {

	public static void main(String[] args) {
		int arr[]=new int[] {11,12,13,14,15,16};
		int n=arr.length;
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			count=count+arr[i];
		}
		int mean=count/2;
		System.out.println(mean +"m");
////////////////////////////////median///////////////////////////////////////////////
//		
        if (n % 2 != 0)
           System.out.println( arr[n / 2]);
        else
       System.out.println( (arr[(n - 1) / 2] + arr[n / 2]) / 2);
	}

}
