public class all_possible_substr {
    public static void main(String[] args) {
        String s="abcd";
        for(int i=0;i<s.length();i++){
//this loop is for starting index of substring 
            for(int j=i+1;j<=s.length();j++){
//this loop is for ending index of substring 
                System.out.println(s.substring(i,j));
            }
        }

    }
}
