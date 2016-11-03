import java.util.*;
public class FindRank {
    private static Scanner s;

	public static void main(String args[] ) throws Exception {
        
        s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
        	arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int t = s.nextInt();
        for(int i=0; i<t; i++){
        	int tc = s.nextInt();
        	System.out.println(findRank(tc,0,n-1, arr));
        }
    }
    
    public static int findRank(int val, int low, int high, int[] arr){
    	while(low<=high){
    		int mid = (low+high)/2;
    		if(arr[mid] == val){
    			return mid+1;
    		}else if(arr[mid] > val){
    			high = mid-1;
    		}else{
    			low = mid+1;
    		}
    	}
    	return -1;
    }
}
