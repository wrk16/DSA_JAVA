public class middle {
    public static int[] mid(int[] array) {
        
        if(array.length <=2){
            
            return new int[0];
        }
        
        int middleArray[]= new int[array.length-2];
        
        int index=1;
        while(index< array.length-1){
            middleArray[index-1]= array[index];
            index++;
        }
        return middleArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,6,7,8,9,10};
        int[] middleArray = mid(array);
        for (int i = 0; i < middleArray.length; i++) {
            System.out.print(middleArray[i] + " ");
        }
        System.out.println();
    }
    
}
