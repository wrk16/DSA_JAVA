public class str_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder sb1=new StringBuilder(10);
//10 is the initial capacity means the maximum number of characters that can be stored in the string builder object
        System.out.println(sb1);
        System.out.println(sb1.length());
//length is a used capacity
//the capacity of and empty string builder object is 16 by default
        System.out.println(sb1.capacity());
    }
}
