import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		int n,i,x;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter value of n");
		n=ref.nextInt();
		int arr[]=new int[n];
		System.out.println("enter element u want to search");
		x=ref.nextInt();
		for(i=0;i<n;i++) {
			arr[i]=ref.nextInt();
			
		}
		for(i=0;i<n;i++) {
			if(arr[i]==x)
				System.out.println("index ="+ i);
			else
				System.out.println("not found");
		}
	}

}
