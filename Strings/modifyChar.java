public class modifyChar {
    public static void main(String[] args) {
        String s="hello";
        //2nd index change to y
        //s=s.substring(0,2)+'y'+s.substring(3);
//but this is wasting a lot of memory and time as it is creating a new string and copying the old string to it.


        System.out.println(s);
    }
    
}
