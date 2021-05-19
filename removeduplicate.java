
public class removeduplicate {

	public static void main(String[] args) {
		int arr[]=new int[]{10,10,20,20,30,40,40,50};
		int res=1;int i;
		for( i=1;i<arr.length;i++) {
			if(arr[i] != arr[res-1])
			{
				arr[res]=arr[i];
				res++;
			}
			
		}
		int m=res;
		System.out.println(m);
		for( i=0;i<m;i++) {
			System.out.println(arr[i]+" ");
			
		}
		
		

	}

}
