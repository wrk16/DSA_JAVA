public class update_position_Str {
    public static void main(String[] args) {
        String s="hemloguys";   //ham
        String str=" ";
        for(int i=0;i<s.length();i++){
            if(i % 2==0){
// even position change to a without using substring
                str += 'a';
}
            else{
                str += s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
