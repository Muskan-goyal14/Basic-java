import java.util.Scanner;

public class reversearr {

	public static void main(String[] args) {
		int n;
		Scanner ref=new Scanner(System.in);
		n=ref.nextInt();
		int arr[]=new int[n];
		int b[]=new int[arr.length];
		b=arr;
		for(int i=0;i<arr.length;i++) {
			arr[i]=ref.nextInt();
		}
		System.out.println("reversed array");
		for(int j=b.length-1;j>=0;j--) {
			System.out.println(b[j]+" ");
			
		}
		
		
		

	}

}
