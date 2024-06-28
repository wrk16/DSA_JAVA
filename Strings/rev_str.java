public class rev_str {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcd");
        //without inbuild func
        // StringBuilder rev = new StringBuilder();
        // for(int i= sb.length()-1;i>=0;i--){
        //     rev.append(sb.charAt(i));

        //with in build func
         sb.reverse();   
        System.out.println(sb.toString());
    }
}
