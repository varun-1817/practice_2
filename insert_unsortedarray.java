public class insortinunsortedarray {

	static int insertarray(int arr[], int n, int capacity, int insrt) {
		if(n>=capacity)
			return n;
		arr[n] = insrt;
			return (n+1);
	}
	
	public static void main(String args[]) {
		int[] arr=new int[7];
		    arr[0] =5;
		    arr[1] = 16;
	        arr[2] = 20;
	        arr[3] = 40;
	        arr[4] = 50;
	        arr[5] = 70;
	        int capacity =10;
	        int n = 6;
	        int i ,insrt = 20;
            System.out.println("before insertion");
            for(i=0;i<arr.length;i++) {
            	System.out.print(arr[i]+" ");
            }
	        n = insertarray(arr, n,capacity,insrt);
	        System.out.println();
	        System.out.println("afterinsertion");
	        for(i=0;i<n;i++) {
	        	System.out.print(arr[i]+" ");
	        }
		
	}
}
