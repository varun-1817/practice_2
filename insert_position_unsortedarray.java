

public class insortinunsortedarray {

	static void insertarray(int arr[], int value, int position, int capacity) {
		for(int i=capacity-1;i>=position;i-- ) 
			arr[i+1] = arr[i];
		arr[position] = value;
	}
	
	public static void main(String args[]) {
		int[] arr=new int[6];
		    arr[0] =5;
		    arr[1] = 16;
	        arr[2] = 20;
	        arr[3] = 40;
	        arr[4] = 50;
	        arr[5] = 70;
	        int capacity =5;
	        int position = 2;
	        int i ;
	        int value = 100;
	        int n=arr.length;
            System.out.println("before insertion");
            for(i=0;i<n;i++) {
            	System.out.print(arr[i]+" ");
            }
	        insertarray(arr, value,position,capacity);
	        n+=1;
	        System.out.println();
	        System.out.println("afterinsertion");
	        for(i=0;i<arr.length;i++) {
	        	System.out.print(arr[i]+" ");
	        }
		
	}
}
