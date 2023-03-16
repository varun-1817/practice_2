package work_placement;

public class generating_subarrays {

	static void printsubarrays(int arr[],int start, int end) {
		
		if(end==arr.length) 
			return ;
		
		else if(start>end)
		printsubarrays(arr,0,end+1);
		
		else {
			 System.out.print("[");
			for(int i= start;i<end;i++)
			    
			     System.out.print(arr[i]+",");
			System.out.println(arr[end]+"]");
			printsubarrays(arr , start+1,end);
			}
			return;
	}
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,3};
		printsubarrays(arr,0,0);
		

	}

}
