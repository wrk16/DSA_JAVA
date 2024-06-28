import java.util.ArrayList;
import java.util.List;
public class pascal {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        int n=5;
        for(int i=0;i<n;i++){
            List<Integer> a = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    a.add(1);
                }
                else{
                    a.add(l.get(i-1).get(j-1)+l.get(i-1).get(j));
                }
            }
            l.add(a);
        
        }
        System.out.println(l);
        }
}