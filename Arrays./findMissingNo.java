public class findMissingNo {
public static int findMissingNumberInArray(int arr[]){
    int n= arr.length+1;
    int naturalnoSum=(n * (n + 1)) / 2;
    int sum=0;

    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    return naturalnoSum-sum;
}

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7,9,10};
        System.out.println("Missing number is:"+findMissingNumberInArray(array));
    }
}
