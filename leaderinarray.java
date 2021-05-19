
public class leaderinarray {

	public static void main(String[] args) {
		int arr[]=new int[] {7, 10, 4, 10, 6, 5, 2};
	
		int n=arr.length;
		int curleader=arr[n-1];
		System.out.println(curleader+" ");
	for(int i=n-2;i>=0;i--) {
			if(curleader<arr[i])
			{
				curleader=arr[i];
				int b=curleader;
						System.out.println(curleader+" ");
			}
		}
		
		
	}

}
