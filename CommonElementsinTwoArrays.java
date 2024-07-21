package Problems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CommonElementsinTwoArrays {
	

	public static void main(String[] args) {
		
	
	int a[]= {1,2,3,4,5,6,7};
	int b[]= {5,6,7,8,9};
	ArrayList<Integer> tmp= new ArrayList<Integer>();
	int r=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
		if(a[i]==b[j])
		{
			int value=a[i];
			tmp.add(value);
		}}
	}
	for(int i:tmp)
	{
		System.out.println(i);
	}
	
	}

}
