import java.util.List;
import java.util.ArrayList;

public class arrlisttwod {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<>();
        b.add(4);   
        b.add(5);   
        b.add(6);
        List<Integer> c = new ArrayList<>();
        c.add(7);   
        c.add(8);   
        c.add(9);
        List<Integer> d = new ArrayList<>();
        d.add(10);  
        d.add(11);  
        d.add(12);
       
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);  l.add(b);   l.add(c);  l.add(d);
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();            
        }
    }
}
