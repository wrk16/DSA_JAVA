public class digonalSum {
public static int digonal(int[][] array){
        int dig=0;
        int n = array.length;
        for (int i=0;i<n;i++ ){
            dig += array[i][i];
        } 
        return dig;
    }


    public static void main(String[] args) {
        int[][] b = { { 8, 2, 13, 4 },
        { 9, 16, 17, 8 },
        { 1, 22, 3, 14 },
        { 15, 6, 17, 8 } };

       System.out.println("ans:"+ digonal(b));
}
        
    }

