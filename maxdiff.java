
public class maxdiff {

	public static void main(String[] args) {
		int a[]=new int[] {2,3,10,6,4,8,1};
		int n=a.length;
		int res=a[1]-a[0];
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(res < (a[j]-a[i]))
					res=a[j]-a[i];
		System.out.println(res);
				

	}

}
