import java.util.Arrays;
import java.util.Scanner;

public class insertele {

	public static void main(String[] args) {
		
		int x,pos;
		int n=10;
Scanner ref =new Scanner(System.in);

int arr[];
arr=new int[] {1,2,3,4,5,6,7,8,9,10};


System.out.println("enter the element which you want to inser");
x=ref.nextInt();
System.out.println("enter position");
pos=ref.nextInt();
Worki reff=new Worki();
int[] fin=reff.insertin(arr, n, x, pos);
System.out.println(Arrays.toString(fin));

	}

}
class Worki{
	int[] insertin(int a[],int n,int x,int pos) {
		int newwarr[]=new int[n+1];
		for(int i=0;i<n+1;i++)
		{
			if(i<pos-1)
				newwarr[i]=a[i];
			else if(i==pos-1)
				newwarr[i]=x;
			else
				newwarr[i]=a[i-1];
		}
		return newwarr;
		
		
	}
	
}