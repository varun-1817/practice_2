public class deletein_unosrtedarray {

	
	  static int findelement(int arr[], int n , int key) 
	  { 
		  int i;
		  for(i=0;i<n;i++) 
			  if(arr[i] == key)
				  return i;
			  return -1;
		  
	  }
	  
	  static int deletion(int arr[], int n, int key) 
	  {
		  
                 int pos = findelement(arr ,n ,key);
                 
                 if(pos ==-1) {
                 System.out.println("not found");
                 return n;
	  }
	              int i;
                 for( i=pos;i<n-1;i++) 
                	 arr[i]= arr[i+1];
                 return n-1;
                 
}
	 
	public static void main(String args[]) {
		int i;
		int arr[]= {2,3,4,5,6,7};
		int n = arr.length;
		int key =5;
		System.out.println("before deletion");
		for(i=0;i<n;i++) 
		
			System.out.print(arr[i]+" ");
		
		
		
		n = deletion(arr, n, key);
		System.out.println("afterdeletion");
		for( i=0;i<n;i++) 
		
			System.out.print(arr[i]+" ");
		
}
}

