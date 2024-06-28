import java.util.Arrays;
public class basic_algo {
    public static void main(String[] args) {
        int arr[]={77,68,7676,75,97,47,58,77,234,351,32};
        int n=arr.length;
        int target=1000;
        Arrays.sort(arr);
        int low=0;
        int high=n-1;
        boolean flag=false;
        while (low<=high) {
            int mid=(high+low)/2;
            if(arr[mid]<target)  low=mid+1;
            else if (arr[mid]> target)   high=mid-1;
            else {  
                flag=true;  break;   
            }
        }
            if(flag) System.out.println("Element found");
            else System.out.println("Element not found");
            


        }
    }
    
