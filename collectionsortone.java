import java.util.ArrayList;

import java.util.Collections;

public class collectionsortone {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>(3);
		al.add(3);
		al.add(4);
		al.add(6);
		//Collections.sort(al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
	}

}
