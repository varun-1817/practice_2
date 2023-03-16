import java.util.Arrays;

public class secondlargest {
       static void print2ndlargest(int arr[],int n) {
    	   
    	   
    	   int i;
    	   if(n<2) {
    		   System.out.println("invalid");
    		   return;
    	   }
    	   Arrays.sort(arr);
    	  
    	   for(i =n-1;i>=0;i--) {
    		   if(arr[i] != arr[n-1]){
    			   System.out.println(arr[i]);
    			   return;
    		   }
    	   }
    	   System.out.println("no second largest");
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int arr[] = { 12, 13, 1, 10, 34, 1 };
			int n = arr.length;
			print2ndlargest(arr, n);
		}
	}

}
