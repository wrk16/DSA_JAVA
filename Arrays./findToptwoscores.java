public class findToptwoscores {

    public static int topTwo(int arr[], int size){
        int i,  second;
        if(size<2){
            System.out.println("Invalid Input");
            return 0;
        }
        int largest = second = Integer.MIN_VALUE;
        for(i=0;i<size;i++){
            largest = Math.max(largest, arr[i]);

    }
    for(i=0;i<size;i++){
        if(arr[i]!=largest)
        second = Math.max(second, arr[i]);
    }

    if(second == Integer.MIN_VALUE){
        System.out.println("There is no second largest element");
    }
    else{
        System.out.println("1st largest:"+largest);
        System.out.println("2nd largest:"+second);
    }
    return 0;
}

    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5,6,7,8,9,10};
        int size = array.length;
        topTwo(array, size);

    }
}
