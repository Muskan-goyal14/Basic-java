
public class nbyk {

	public static void main(String[] args) {
		int arr[]=new int[] {3,1,2,2,1,2,3,3};
		int N=8;
		int K=4;
		int j;
		int count;
		 for (int i = 0; i < N;) {
			 
		        // Stores frequency of arr[i]
		        int cnt = 1;
		 
		        // Traverse array elements which
		        // is equal to arr[i]
		        while ((i + 1) < N
		               && arr[i] == arr[i + 1]) {
		 
		            // Update cnt
		            cnt++;
		 
		            // Update i
		            i++;
		        }
		 
		        // If frequency of arr[i] is
		        // greater than (N / K)
		        if (cnt > (N / K)) {
		 
		            System.out.print(arr[i]+ " ");
		        }
		        i++;
		
		
	}

}}
