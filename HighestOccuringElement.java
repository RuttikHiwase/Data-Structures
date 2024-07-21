package Problems;

public class HighestOccuringElement {
	public static void main(String[] args) {
		
	
	int arr[]= {1,2,3,1,1,4,5,6};
	int count=0;
	int element=0;
	//int temp[]=new int[15];
	//int t=0;
	int maxcount=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=1+i;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			count++;
			    
		}
			
			//	int element=0;
				if(count> maxcount)
				{
					maxcount=count;
					element=arr[i];
				}
		}
		
		
	
	System.out.println(element);
	
	
	
	
	
	
	}
}
