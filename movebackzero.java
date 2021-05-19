
public class movebackzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{10,0,2,3,0,5,0,0,8};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[j]!=0)
					//a=b	swap(arr[i],arr[j]);
						i=j;
					//wrong code
						
				}
			}
		}
	}

}
